package himedia.alone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	@GetMapping("/join")
	public String join(@RequestParam String name, @RequestParam("age") int age, Model model) {
		model.addAttribute("name", name).addAttribute("age", age);
		return "member/join";
	}
}
