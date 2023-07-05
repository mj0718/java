package himedia.third.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import himedia.third.domain.Member;
import himedia.third.domain.MemberForm;
import himedia.third.service.MemberService;

@Controller
public class MemberController {
	
	private final MemberService service;
	
	public MemberController(MemberService service) {
		this.service=service;
	}
	
	@GetMapping("/member/new")
	public String form() {
		return "member/new-form";
	}

//	@PostMapping("/member/new")
//	public String create(@RequestParam String name) {
//		Member member = new Member();
//		member.setName(name);
//
//		System.out.println("name >> " + name);
//		
//		service.join(member);
//		return "redirect:/";
//	}
	// 데이터가 많을 때는 ModelAttribute 사용 (RequestParam은 불편함)
	@PostMapping("/member/new")
	public String create(@ModelAttribute MemberForm form) {
		Member member = new Member();
		member.setName(form.getName());
		
		System.out.println("name >> " + form.getName());
		
		service.join(member);
		return "redirect:/";
	}
	
	@GetMapping("/member/list")
	public String memberList(Model model) {
		List<Member> members = service.findMembers();
		model.addAttribute("members", members);
		return "member/member-list";
	}
}
