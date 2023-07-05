package himedia.second.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import himedia.second.domain.Member;
import himedia.second.domain.MemberForm;
import himedia.second.domain.NewMember;
import himedia.second.service.MemberService;

@Controller
public class MemberController {

	// [첫 번째 방법]
	// private final MemberService memberService = new MemberService();

	// [두 번째 방법]
	private final MemberService memberService;

	// ================================================
	// DI(Dependency Injection): 의존성 주입
	// - Bean을 자동 주입
	// - 객체(Bean) 생성이 외부에서 결정
	// - 모듈(class파일)간의 결합도가 낮아지고 유연성이 높아짐
	// ================================================
	// 생성자를 통한 의존성 주입
	// @Autowired (생략가능)
	public MemberController(MemberService memberService) {
		System.out.println("[MemberController] 실행");
		this.memberService = memberService;
	}

	@GetMapping("/member/new")
	public String form() {
		return "member/new-form";
	}

	@PostMapping("/member/new")
	public String create(MemberForm form) {
		System.out.println("[post mapping] 이름 >> " + form.getName());

		// service code
		Member member = new Member();
		member.setName(form.getName());
		memberService.join(member);

		return "redirect:/";
	}

	@GetMapping("/member/list")
	public String memberList(Model model) {
		List<Member> members = memberService.findMember();
		model.addAttribute("members", members);
		return "member/member-list";
	}
	// [방법 1] ---------------------------------------------------------------------------
	// [형태 1] ===========================================================================
//	@GetMapping("/member/search")
//	public String memberSearch(@RequestParam(name = "id", required = false) Long id,
//								@RequestParam(name = "name") String name, 
//								Model model) {
//		
//		System.out.println("[controller] id >> "+ id);
//		System.out.println("[controller] name >> "+ name);
//		Member member = new Member(); // 빈 객체
//		// service code
//		//Optional <Member> member = memberService.findId(id);
//		if(id!=null) {
//			member = memberService.findId(id).get();
//		} else if(!name.isEmpty()) {
//			member = memberService.findName(name).get();
//		}
//		System.out.println("[controller] member >> " + member);
//		model.addAttribute("member", member);
//
//		return "member/search";
//	}
	// [형태 2] 위 코드 정리 ================================================================
//	@GetMapping("/member/search")
//	public String memberSearch(@RequestParam(name = "id", required = false) Long id,
//								String name, 
//								Model model) {
//		
//		Member member = new Member(); // 빈 객체
//		
//		if(id!=null) {
//			member = memberService.findId(id).get();
//		} else if(!name.isEmpty()) {
//			member = memberService.findName(name).get();
//		}
//		
//		model.addAttribute("member", member);
//		return "member/search";
//	}
	
	// [방법 2] ------------------------------------------------------------------------------
	// [리플렉션 기법] : Reflection
	// view -> controller
	// 자동으로 setter 실행 => 데이터 자동 처리
	
	// parameter에 사용되는 @MeodelAttributes와 Model 차이
	// @ModelAttribute: view -> controller로 데이터 넘어 올 때
	// model : controller -> view로 데이터 넘길 때
	// [형태 1] ===========================================================================
//	@GetMapping("/member/search")
//	public String memberSearch(@ModelAttribute("member") NewMember member, Model model) {
//		System.out.println("member id >> "+ member.getId());
//		System.out.println("member name >> "+ member.getName());
//		System.out.println("빈 문자열이니? >> "+"".equals(member.getName()));
//		
//		Member searchMember = new Member();  // 빈 객체
//		
//		if(member.getId() != null) {
//			searchMember = memberService.findId(member.getId()).get();
//		} else if (!member.getName().isEmpty()) {
//			searchMember = memberService.findName(member.getName()).get();
//		}
//		model.addAttribute("member", searchMember);
//		
//		return "member/search";
//	}
	// [형태 2] ===========================================================================
	@GetMapping("/member/search")
	public String memberSearch(NewMember member, Model model) {
		// [방법 1]
//		Member searchMember = new Member();  // 빈 객체
//		
//		if(member.getId() != null) {
//			searchMember = memberService.findId(member.getId()).get();
//		} else if (!member.getName().isEmpty()) {
//			searchMember = memberService.findName(member.getName()).get();
//		} 
//		model.addAttribute("member", searchMember);
		
		// [방법 2]
		Optional<Member> searchMember = Optional.empty();
		
		if (member.getId() != null)
			searchMember = memberService.findId(member.getId());
		else if (!member.getName().isEmpty())
			searchMember = memberService.findName(member.getName());
		
		if (searchMember.isPresent())
			model.addAttribute("member", searchMember.get());
//		else
//			model.addAttribute("member", new Member());
		
		// [과제] 위 코드 정리
		
		return "member/search";
	}
}
