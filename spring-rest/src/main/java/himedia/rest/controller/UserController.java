package himedia.rest.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import himedia.rest.domain.User;
import himedia.rest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class UserController {
	
	private final UserRepository repository;
	
	@PostMapping 
	public User postMethod(@RequestBody User user) {
		log.info("[POST] ===========");
		log.info("user name >> {}", user.getName());
		log.info("user age >> {}", user.getAge());
		return repository.save(user);
	}
	
	@GetMapping
	public User getMethod(@RequestParam Long id) {
		User user = repository.findById(id).get();
		
		log.info("[GET] ===========");
		log.info("user id >> {}", user.getId());
		log.info("user name >> {}", user.getName());
		log.info("user age >> {}", user.getAge());
		return user;
	}
	
	@PutMapping
	public User putMethod(@RequestBody User user) {		
		log.info("[PUT] ===========");
		log.info("user id >> {}", user.getId());
		log.info("user name >> {}", user.getName());
		log.info("user age >> {}", user.getAge());
		return repository.save(user);
	}
	
	@PatchMapping
	public User patchMethod(@RequestBody User user) {		
		log.info("[PATCH] ===========");
		log.info("user id >> {}", user.getId());
		log.info("user name >> {}", user.getName());
		log.info("user age >> {}", user.getAge());
		return repository.save(user);
	}
	
	@DeleteMapping
	public String deleteMethod(@RequestParam Long id) {	
		log.info("[DELETE] ===========");
		repository.deleteById(id);
		return "아이디 : "+id+" >> 삭제 완료";
	}
}
