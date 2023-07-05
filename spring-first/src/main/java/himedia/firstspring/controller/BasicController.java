package himedia.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/basic")
public class BasicController {
	
	/**
	 * [문서 주석]
	 * Java Documentation Comment
	 * 
	 */
	
	/**
	 * [view 저장 위치에 따른 웹 개발 종류]
	 * --------------------------------------------------------------------------
	 * 							  [파일 위치]			     [처리]
	 * 1. static content		resources/static		       X
	 * 2. dynamic content		resources/templates		   ViewResolver
	 * 3. API					  		X				HttpMessageConverter
	 * --------------------------------------------------------------------------
	 * 
	 * 1. static content 
	 * - 서버에서 파일을 그대로 웹 브라우저에 전송
	 * - 파일 위치: resources/static
	 * - 이런 파일을 static web page라고 부름
	 * 
	 * 2. dynamic content 
	 * - 서버에서 HTML을 동적 변경(처리)하여 웹 브라우저에 전송
	 * - 파일 위치: resources/templates/{ViewName}.html
	 * - MVC : Model(data), View(html), Controller(method, handler)
	 * - dynamic web page
	 * 
	 * 3. API
	 * - JSON 포맷(형식)으로 데이터 전송
	 * - 객체를 넘길 수 있음 : HttpMessageConverter가 JSON으로 변환
	 * 
	 * ==========================================================================
	 */
	
	/**
	 * 2-1. MVC
	 * : handler level mapping
	 */
	
	@GetMapping("/first-mvc")
	public String firstMvc() {
		return "basic/first";  // 논리적인 뷰
	}
	
	/**
	 * [문제] bestseller 요청에 대한 응답 페이지를 bestseller.html로 하시오
	 */
	@GetMapping("/bestseller")
	public String bestSeller() {
		return "basic/book/bestseller";
	}
	
	/**
	 * 2-2. MVC
	 * : view template을 통해 데이터 표현
	 * : template engine - thymeleaf
	 */
	
	@GetMapping("/second-mvc")
	public String secondMvc(Model model) {
		model.addAttribute("name", "홍길동");
		return "basic/second";
	}
	
	/** 
	 * 2-3. MVC
	 * : 쿼리 파라미터(query parameter) 처리
	 * : 요청 - localhost:8080/third-mvc?fruit=사과
	 * => IP:port/경로/파일명.확장?query parameter
	 */
	@GetMapping("/third-mvc")
	public String thirdMvc(@RequestParam("fruit") String fruit, Model model) {
		System.out.println("fruit >> " + fruit);
		System.out.println("[요소 추가 전] model >> " + model);
		model.addAttribute("fruit", fruit);
		System.out.println("[요소 추가 후] model >> " + model);
		return "basic/third";
	}
	
	/**
	 * [문제] 요청 - localhost:8080/fruit?count=7&sort=딸기
	 * 쿼리 파라미터의 값을 quiz-fruit-count 뷰에 표현하시오.
	 */
	@GetMapping("/fruit")
	public String fruit(@RequestParam int count, @RequestParam String sort, Model model) {
//		model.addAttribute("count", count);
//		model.addAttribute("sort", sort);
		model.addAttribute("count", count).addAttribute("sort", sort);
		return "basic/quiz-fruit-count";
	}
	
	/**
	 * 3-1-1. API
	 * : String 전송
	 */
	@GetMapping("/api-one")
	@ResponseBody
	public String apiOne() {
		return "문자열로 리턴합니다.";
	}
	
	/**
	 * 3-1-2. API
	 * : String 전송
	 */
	@GetMapping("/api-test")
	@ResponseBody
	public String apiTest() {
		return "test";
	}
	
	/**
	 * 3-2. API
	 * : json 형식으로 전송
	 */
	@GetMapping("/api-two")
	@ResponseBody
	public Student apiTwo(@RequestParam("name") String name, @RequestParam("age") int age) {
		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		return student;
	}
	class Student {
		private String name;
		private int age;
		
		public final String getName() {
			return name;
		}
		public final void setName(String name) {
			this.name = name;
		}
		public final int getAge() {
			return age;
		}
		public final void setAge(int age) {
			this.age = age;
		}
	}

}
