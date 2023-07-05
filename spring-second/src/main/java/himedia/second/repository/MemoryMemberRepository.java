package himedia.second.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Repository;

import himedia.second.domain.Member;

//@Primary
//@Repository
public class MemoryMemberRepository implements MemberRepository{

	private static Map<Long, Member> store = new HashMap<>();
	private static long sequence = 0L;
	
	@Override
	public Member save(Member member) {
		member.setId(++sequence);
		System.out.println("[repository] id >> "+member.getId());
		store.put(member.getId(), member);
		return member;
	}

	@Override
	public Optional<Member> findById(Long id) {
		System.out.println("[MemoryMemberRepository] 실행됨");
		return Optional.ofNullable(store.get(id));
	}

	@Override
	public Optional<Member> findByName(String name) {
//		for(Member m : store.values()) {
//			if (m.getName().equals(name))
//				return Optional.of(m);
//		}
//		return Optional.empty();
		
		// [문제] stream으로 변경
		return store.values().stream().filter(m -> m.getName().equals(name)).findAny();
	}

	@Override
	public List<Member> findAll() {
		return new ArrayList<>(store.values());
	}
}
