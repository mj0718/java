package himedia.third.repository;

import java.util.List;
import java.util.Optional;

import himedia.third.domain.Member;

public interface MemberRepository {
	Member save(Member member);  //저장소 저장
	Optional<Member> findById(Long id);  //id 조회
	Optional <Member> findbyName(String name);  //name 조회
	List<Member> findAll();
}
