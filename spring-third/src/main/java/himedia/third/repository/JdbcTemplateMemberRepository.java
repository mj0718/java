package himedia.third.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import himedia.third.domain.Member;

@Primary
@Repository
public class JdbcTemplateMemberRepository implements MemberRepository{
	
	private final JdbcTemplate jdbcTemplate;
	
	public JdbcTemplateMemberRepository(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private RowMapper<Member> memberRowMapper() {
		return (rs, rowNum) -> {
			Member member = new Member();
			member.setId(rs.getLong("id"));
			member.setName(rs.getString("name"));
			return member;
		};
	}

	@Override
	public Member save(Member member) {
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
		jdbcInsert.withTableName("member").usingGeneratedKeyColumns("id");  //테이블명 입력, id가 자동으로 1씩 증가
		
		// member table에 저장할 데이터를 HashMap에 추가
		Map<String, Object> parameters = new HashMap<>(); // object인 이유: 여러 칼럼일 때는 자료형이 다양하므로 object로 하는게 좋음
		parameters.put("name", member.getName());
		Number key = jdbcInsert.executeAndReturnKey(parameters);
		member.setId(key.longValue());
		return member;
	}

	@Override
	public Optional<Member> findById(Long id) {
		List<Member> result = jdbcTemplate.query("select * from member where id = ?", memberRowMapper(), id);
		return result.stream().findAny();
	}

	@Override
	public Optional<Member> findbyName(String name) {
		List<Member> result = jdbcTemplate.query("select * from member where name like ?", memberRowMapper(), name);  //like가 =보다 더 좋음
		return result.stream().findAny();
	}

	@Override
	public List<Member> findAll() {
		return jdbcTemplate.query("select * from member", memberRowMapper());
	}
}
