package himedia.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
// @GetMapping은 올 수 없음
@RequestMapping("/item")	// class level mapping
public class ItemController {
	
	//@GetMapping("/item")  //handler level mapping
	@GetMapping
	public String welcome() {
		return "item/welcome";
	}
	//@GetMapping("/item/item-list")
	@GetMapping("/item-list")
	public String item() {
		return "item/item";
	}
	//@GetMapping("/item/item-view")
	@GetMapping("/item-view")
	public String itemView(Model model) {
		model.addAttribute("title", "새우깡");
		// price는 1500으로 넘기시오
		model.addAttribute("price", 1500);
		return "item/item-view";
	}
}
