package himedia.fourth.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import himedia.fourth.domain.Item;
import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class JdbcTemplateRepository implements ItemRepository{
	private final JdbcTemplate jdbcTemplate;
	
	public JdbcTemplateRepository(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private RowMapper<Item> itemRowMapper() {
		return (rs, rowNum) -> {
			Item item = new Item();
			item.setId(rs.getLong("id"));
			item.setItemName(rs.getNString("itemname"));
			item.setPrice(rs.getInt("price"));
			item.setQuantity(rs.getInt("quantity"));
			return item;
		};
	}

	@Override
	public Item save(Item item) {
		log.info("== save() 실행 시작 ==");
//		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
//		jdbcInsert.withTableName("item").usingGeneratedKeyColumns("id");
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("item").usingGeneratedKeyColumns("id");
		
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("itemname", item.getItemName());
		parameters.put("price", item.getPrice());
		parameters.put("quantity", item.getQuantity());
		
		Number key = jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(parameters));
		
		item.setId(key.longValue());
		log.info("== save() 실행 종료 ==");
		return item;
	}

	@Override
	public Optional<Item> findById(Long id) {
		List<Item> result = jdbcTemplate.query("select * from item where id = ?", itemRowMapper(), id);
		return result.stream().findAny();
	}

	@Override
	public Optional<Item> findByName(String name) {
		String sql = "select * from item where itemname like ?";
		List<Item> result = jdbcTemplate.query(sql, itemRowMapper(), "%"+name+"%");
		if(name.isBlank()) // 빈칸, 스페이스바 입력 시 아무것도 안 보이게 출력
			return Optional.empty();
//		log.info("findByName result >> {}", result);
//		log.info("findByName result.stream().findAny() >> {}", result.stream().findAny());
		return result.stream().findAny();
	}

	@Override
	public List<Item> findAll() {
		return jdbcTemplate.query("select * from item", itemRowMapper());
	}

	@Override
	public Item update(Long itemId, Item updateItem) {
		String sql = "update item set itemname = ?, price = ?, quantity = ? where id = ?" ;
		int result = jdbcTemplate.update(sql, 
				updateItem.getItemName(), 
				updateItem.getPrice(), 
				updateItem.getQuantity(), 
				itemId);
		log.info("[update method] result >> {}", result);
		return findById(itemId).get();  // DB에 있는 데이터를 리턴해야하므로 updateItem을 리턴하면 안됨
	}

	@Override
	public void clearStore() {
		int rowCount = jdbcTemplate.update("delete from item");
		log.info("삭제된 로우 개수 >> {}", rowCount);
	}
}
