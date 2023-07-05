package himedia.third.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import himedia.third.domain.Member;
import himedia.third.repository.MemoryMemberRepository;

@SpringBootTest
class MemberServiceTest {
	// [방법 1]
//	MemberService memberService = new MemberService(new MemoryMemberRepository());
	
	// [방법 2]
//	MemoryMemberRepository repository = new MemoryMemberRepository();
//	MemberService memberService = new MemberService(repository);
	
	// [방법 3] field를 통한 DI -> @SpringBootTest가 있어야 bean이 만들어짐
	// 필드에서는 @Autowired을 한줄로 해도 두줄로 해도 상관 없음
	@Autowired MemoryMemberRepository repository;
	@Autowired MemberService memberService;

	@AfterEach  
	void afterEach() {
		repository.clearStore();
	}
	
	@Test
	void 회원가입() {
		// given : 어떤 데이터
		Member member = new Member();
		member.setName("one");
		// when : 가입
		Long saveId = memberService.join(member);
		// then : 검증 - id가 같은지 검증
		assertThat(saveId).isEqualTo(member.getId());
	}

	@Test
	void 아이디조회() {
		// given : 어떤 데이터
		Member member = new Member();
		member.setName("two");
		Long saveId = memberService.join(member);

		// when : 아이디 조회
		Member findMember = memberService.findId(saveId).get();

		// then : 검증 - id가 같은지 검증
		assertThat(findMember.getId()).isEqualTo(saveId);
		//assertThat(findMember).isEqualTo(member);
	}

	@Test
	void 이름조회() {
		// given : 어떤 데이터
		Member member = new Member();
		member.setName("three");
		memberService.join(member);

		// when : 이름 조회
		Member findMember = memberService.findName(member.getName()).get();

		// then : 검증 - 이름이 같은지 검증
		assertThat(findMember.getName()).isEqualTo(member.getName());
	}

	@Test
	void 전체조회() {
		// given : 어떤 데이터
		Member member1 = new Member();
		member1.setName("four");
		memberService.join(member1);

		Member member2 = new Member();
		member2.setName("five");
		memberService.join(member2);

		// when : 전체 데이터 조회
		List<Member> result = memberService.findMembers();

		// then : 검증
		assertThat(result.size()).isEqualTo(2);
	}
}
