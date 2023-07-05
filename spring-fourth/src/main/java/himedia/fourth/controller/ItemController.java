package himedia.fourth.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import himedia.fourth.domain.Item;
import himedia.fourth.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/store/items")
@Slf4j
public class ItemController {
	private final ItemRepository repository;
	
	public ItemController(ItemRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public String items(Model model) {
		List<Item> items = repository.findAll();
		model.addAttribute("items", items);
		
		return "store/items";
	}
	
	@GetMapping("/{itemId}")
	public String item(@PathVariable(name="itemId") Long itemId, Model model) {
		Item item = repository.findById(itemId).get();
		model.addAttribute("item", item);
		log.info("itemId >> {}", itemId);
		return "store/item";
	}
	
	// 상품 수정 폼
	@GetMapping("/{itemId}/edit")
	public String editForm(@PathVariable Long itemId, Model model) {
		Item item = repository.findById(itemId).get();
		model.addAttribute("item", item);
		return "store/editForm";
	}
	
	// 상품 수정
	@PostMapping("/{itemId}/edit")
	public String edit(@PathVariable Long itemId, @ModelAttribute Item item) {
		repository.update(itemId, item);
		//return "redirect:/store/items/{itemId}";
		// 왜 상품 ID가 안 보이는 이유는?, model이 없는데 객체가 넘어간 이유는?, 넘어간 객체는 무엇?
		// redirect한 이유?
		return "/store/item";
	}
	
	// 상품 등록 폼
	@GetMapping("/add")
	public String addForm() {
		return "/store/addForm";
	}
	
	// 상품 등록
	// [방법 1] 웹 브라우저에서 새로고침하면 재전송됨
	// @ModelAttribute가 있어서 Model이 없어도 값이 바로 넘어옴 (model을 자동으로 추가해줘서)
//	@PostMapping("/add")
//	public String add(@ModelAttribute Item item) {
//		repository.save(item);
//		return "/store/item";
//	}
	
	// [참고] 
//	@PostMapping("/add")
//	public String add(@RequestParam String itemName, @RequestParam int price, @RequestParam int quantity, Model model) {
//		log.info("itemName >> {}", itemName);
//		log.info("price >> {}", price);
//		log.info("quantity >> {}", quantity);
//		
//		Item item = new Item(itemName, price, quantity);
//		repository.save(item);
//		
//		model.addAttribute("item", item);
//		return "/store/item";
//	}
	
	// [방법 2] redirect 이용 (문자열일 경우 encoding 불가)
//	@PostMapping("/add")
//	public String add(@ModelAttribute Item item) {
//		repository.save(item);
//		return "redirect:/store/items/" + item.getId();
//	}
	
	// [방법 3] RedirectAttributes 이용 : PRG - POST->Redirect->GET
	@PostMapping("/add")
	public String add(@ModelAttribute Item item, RedirectAttributes redirectAttributes) {
		repository.save(item);
		redirectAttributes.addAttribute("itemId", item.getId());
		return "redirect:/store/items/{itemId}";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam String search, Model model) {
		Item item = repository.findByName(search).orElse(new Item());
		model.addAttribute("item", item);
		return "/store/item";
	}
}
