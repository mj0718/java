package himedia.rest.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

//@Controller
//@ResponseBody
@RestController
@Slf4j
public class RestAPIController {
	
	@GetMapping
	public String getMethod(String name) {
		log.info("[GET] ===========");
		log.info("name >> {}", name);
		return "GET method 실행";
	}
	
	@PostMapping
	public String postMethod(String name) {
		log.info("[POST] ===========");
		log.info("name >> {}", name);
		return "POST method 실행";
	}
	
	@PutMapping
	public String putMethod(String name) {
		log.info("[PUT] ===========");
		log.info("name >> {}", name);
		return "PUT method 실행";
	}
	
	@PatchMapping
	public String patchMethod(String name) {
		log.info("[PATCH] ===========");
		log.info("name >> {}", name);
		return "PATCH method 실행";
	}
	
	@DeleteMapping
	public String deleteMethod(String name) {
		log.info("[DELETE] ===========");
		log.info("name >> {}", name);
		return "DELETE method 실행";
	}
}
