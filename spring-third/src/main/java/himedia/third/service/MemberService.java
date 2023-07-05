package himedia.third.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import himedia.third.domain.Member;
import himedia.third.repository.MemberRepository;

@Service
public class MemberService {
	private final MemberRepository repository;
	
	public MemberService(MemberRepository repository) {
		this.repository=repository;
	}
	
	// 회원 가입
	public Long join(Member member) {
		repository.save(member);
		return member.getId();
	}
	
	// 아이디 조회
	public Optional<Member> findId(Long id) {
		return repository.findById(id);
	}
	
	// 이름 조회
	public Optional<Member> findName(String name) {
		return repository.findbyName(name);
	}
	
	// 전체 조회
	public List<Member> findMembers() {
		return repository.findAll();
	}
}
