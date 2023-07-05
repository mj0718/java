package himedia.second.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import himedia.second.domain.Member;

// JDBC : Java Database Connectivity
// Spring Boot JDBC

@Repository
public class JdbcTemplateMemberRepository implements MemberRepository{
	private final JdbcTemplate jdbcTemplate;
	
	public JdbcTemplateMemberRepository(DataSource dataSource) {
		System.out.println("[JdbcTemplateMemberRepository] 실행");
		this.jdbcTemplate= new JdbcTemplate(dataSource);
	}
	
	// return된 결과를 하나씩 꺼내 객체에 저장하는 과정
	private RowMapper<Member> memberRowMapper() {
		return new RowMapper<Member>() {
			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member member = new Member();
				member.setId(rs.getLong("id"));
				member.setName(rs.getString("name"));
				return member;
			}
		};
	}

	@Override
	public Member save(Member member) {
		// 데이터 저장을 쉽게 해줌
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
		// id를 1씩 증가시켜줌
		jdbcInsert.withTableName("member").usingGeneratedKeyColumns("id");
		
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("name", member.getName());
		
		Number key = jdbcInsert.executeAndReturnKey(parameters);
		System.out.println("[save method] DB에 데이터 저장 후 리턴 받은 key value >> "+key);
		member.setId(key.longValue());
		
		return member;
	}

	@Override
	public Optional<Member> findById(Long id) {
		List<Member> result = jdbcTemplate.query("select * from member where id = ?", memberRowMapper(), id);
		// [방법 1]
//		for(Member member : result) {
//			if(member.getId().equals(id))
//				return Optional.of(member);
//		}
//		return Optional.empty();
		
		// [방법 2] 
		return result.stream().findAny();
	}

	@Override
	public Optional<Member> findByName(String name) {
		// [과제]
		List<Member> result = jdbcTemplate.query("select * from member where name = ?", memberRowMapper(), name);
		// [방법 1]
//		for (Member member : result) {
//			if(member.getName().equals(name))
//				return Optional.of(member);
//		}
//		return Optional.empty();
		// [방법 2]
		return result.stream().findAny();
	}

	@Override
	public List<Member> findAll() {
		return jdbcTemplate.query("select * from member", memberRowMapper());
	}
}
