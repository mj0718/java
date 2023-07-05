package himedia.fourth.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import himedia.fourth.domain.Item;
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class JdbcTemplateRepositoryTest {
	
	@Autowired JdbcTemplateRepository repository;

	@Test
	void 저장() {
		// given : 어떤 데이터??
		Item item = new Item("테스트1", 1000, 5);
		log.info("저장 전 item.getId() >> {}", item.getId());
		
		// when : 무슨 작업??
		Item saveItem = repository.save(item);
		
		// then : 검증??
		// 상품명 확인
		assertThat(saveItem.getItemName()).isEqualTo(item.getItemName());
		// item과 saveItem 주소 확인
		assertThat(saveItem).isEqualTo(item);		
		// 상품아이디 확인		
		assertThat(saveItem.getId()).isEqualTo(item.getId());
		
		// id가 궁금하다...
		System.out.println("item.getId() >> " + item.getId());
		log.info("item.getId() >> " + item.getId());
		log.info("saveItem.getId() >> {}", saveItem.getId());
	}
	
	@Test
	void 아이디검색() {
		// given : 어떤 데이터
		Item item = new Item("테스트2", 2000, 2);
		Item saveItem = repository.save(item);
		
		// when : 어떤 작업
		Optional<Item> result = repository.findById(saveItem.getId());		
		
		// then : 검증
		assertThat(result).isNotNull();
		assertThat(result.isPresent()).isEqualTo(true);
	}	
	
	@Test
	void 이름검색() {
		// given
		Item item = new Item("테스트3", 3000, 3);
		repository.save(item);
		
		// when
		Optional<Item> result = repository.findByName(item.getItemName());
		
		// then
		assertThat(result.isPresent()).isEqualTo(true);
		assertThat(result.get().getItemName()).isEqualTo(item.getItemName());
	}
	
	@Test
	void 전체검색() {
		List<Item> before = repository.findAll();
		
		Item item = new Item("테스트4", 4000, 4);
		repository.save(item);
		
		List<Item> after = repository.findAll();
		
		assertThat(after.size()).isEqualTo(before.size() + 1);		
	}
	
	@Test
	void 수정() {
		// given : 어떤 데이터
		Item item = new Item("테스트5", 5000, 5);
		log.info("[저장 전] item id >> ", item.getId());
		Item saveItem = repository.save(item);				
		
		// when : 어떤 작업
		Item updateItem = new Item("테스트5 수정", 6000, 6);
		repository.update(item.getId(), updateItem);		
		
		// then : 검증
		assertThat(repository.findById(item.getId()).get().getItemName())
			.isEqualTo(updateItem.getItemName());	
		
		// 로그 
		log.info("[저장 후] item id >> {}", item.getId());
		log.info("saveItem id >> {}", saveItem.getId());
		
		log.info("item itemName >> {}", item.getItemName());
		log.info("saveItem itemName >> {}", saveItem.getItemName());
	}	
	
	@Test
	void 모두삭제() {
		repository.clearStore();
		
		// 삭제 후 전체 검색하면, 빈 리스트가 리턴
		assertThat(repository.findAll()).isEmpty();
	}	
	
	@Test
	void test() {
		/*
		 * [log level] ============================
		 * default level : info
		 * trace > debug > info > warn > error
		 * 개발 서버 : debug
		 * 운영 서버 : info
		 * ========================================
		 */
		String str = "log test...";
		log.trace("1. trace : {}", str);
		log.debug("2. debug : {}", str);
		log.info("3. info : {}", str);
		log.warn("4. warn : {}", str);
		log.error("5. error : {}", str);		
	}
	
}































