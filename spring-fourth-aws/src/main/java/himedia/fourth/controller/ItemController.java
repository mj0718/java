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
	
	// [상품 목록] =========================================
	@GetMapping
	public String items(Model model) {
		List<Item> items = repository.findAll();
		model.addAttribute("items", items);
		
		return "store/items";		
	}
	
	// [상품 상세] ==================================================
	@GetMapping("/{itemId}")
	public String item(@PathVariable(name = "itemId") Long itemId, 
			Model model) {
		Item item = repository.findById(itemId).get();
		model.addAttribute("item", item);
		log.info("itemId >> {}", itemId);
		return "store/item";
	}
	
	// [상품 수정 폼] ================================================
	@GetMapping("/{itemId}/edit")
	public String editForm(@PathVariable(name="itemId") Long itemId,
			Model model) {
		Item item = repository.findById(itemId).get();
		model.addAttribute("item", item);
		return "store/editForm";				
	}
	
	// [상품 수정] ===================================================
	@PostMapping("/{itemId}/edit")
	public String edit(@PathVariable(name="itemId") Long itemId, 
			@ModelAttribute Item item) {
		// [확인] item의 id ++++++++++++++++++++++++++++++++
		repository.update(itemId, item);
		//return "redirect:/store/items/{itemId}";		
		return "/store/item";
	}
	
	// [상품 등록 폼(화면)] ============================================
	@GetMapping("/add")
	public String addForm() {
		return "store/addForm";
	}
	
	// [상품 등록] =====================================================
	// [방법 1] web browser에서 새로고침(F5)을 하면, 재전송됨!!
//	@PostMapping("/store/items/add")
//	public String addItem(@ModelAttribute Item item) {
//		repository.save(item);
//		return "/store/item";
//	}
	
	// cf)
//	@PostMapping("/store/items/add")
//	public String addItem(@RequestParam String itemName,
//			@RequestParam int price,
//			@RequestParam int quantity,
//			Model model) {		
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
	
	// [방법 2] redirect 이용
//	@PostMapping("/store/items/add")
//	public String addItem(@ModelAttribute Item item) {
//		repository.save(item);
//		return "redirect:/store/items/" + item.getId();
//	}

	// [방법 3] RedirectAttributes 이용 : PRG - POST->Redirect->GET
	@PostMapping("/add")
	public String addItem(@ModelAttribute Item item, 
			RedirectAttributes redirectAttributes) {
		repository.save(item);
		
		// [query string(query parameter) 추가] ===============
		//redirectAttributes.addAttribute("name", "홍길동");
		
		// [URI 추가] =========================================
		redirectAttributes.addAttribute("itemId", item.getId());		
		return "redirect:/store/items/{itemId}";
	}	
	
	@GetMapping("/search")
	public String search(@RequestParam String search, Model model) {
		Item item = repository.findByName(search).orElse(new Item());
		//log.info("[search] 조회 결과 item >> {}", item);
		model.addAttribute("item", item);
		return "/store/item";
	}	
}