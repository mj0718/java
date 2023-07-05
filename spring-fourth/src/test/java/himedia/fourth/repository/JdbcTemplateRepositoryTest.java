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

	@Autowired
	JdbcTemplateRepository repository;

	@Test
	void 저장() {
		// given
		Item item = new Item("test", 1000, 2);
		log.info("저장 전 item.getId() >> {}", item.getId());

		// when
		Item itemSave = repository.save(item);

		// then
		// 상품명 확인
		assertThat(itemSave.getItemName()).isEqualTo(item.getItemName());
		// 주소 확인
		assertThat(itemSave).isEqualTo(item);
		// 아이디 확인
		assertThat(itemSave.getId()).isEqualTo(item.getId());

		System.out.println("item.getId() >> " + item.getId());

		log.info("item.getId() >> " + item.getId());
		log.info("itemSave.getId() >> {}", itemSave.getId());
	}
	
	@Test
	void 아이디검색() {
		Item item = new Item("second", 5000, 3);
		Item saveItem = repository.save(item);
		
		Optional<Item> result = repository.findById(saveItem.getId());
		
		assertThat(result).isNotNull();
		assertThat(result.isPresent()).isEqualTo(true);
	}
	
	@Test
	void 이름검색() {
		Item item = new Item("third", 4500, 1);
		repository.save(item);
		
		Optional<Item> result = repository.findByName(item.getItemName());
		
		assertThat(result.isPresent()).isEqualTo(true);
		assertThat(result.get().getItemName()).isEqualTo(item.getItemName());
	}
	
	@Test
	void 전체검색() {
		List<Item> before = repository.findAll();
		
		Item item = new Item("four", 13000, 7);
		repository.save(item);
		
		List<Item> after = repository.findAll();
		
		assertThat(after.size()).isEqualTo(before.size()+1);
	}
	
	@Test 
	void 수정() {
		
		Item item = new Item("update", 1500, 5);
		log.info("[저장 전] item id >> {} ", item.getId());
		Item saveItem = repository.save(item);
		
		Item updateItem = new Item("수정", 5000, 3);
		repository.update(item.getId(), updateItem);
		
		assertThat(repository.findById(item.getId()).get().getItemName())
				.isEqualTo(updateItem.getItemName());
		
		log.info("[저장 후] item id >> {} ", item.getId());
		log.info("saveItem id >> {}", saveItem.getId());
		
		log.info("item itemName >> {}", item.getItemName());
		log.info("saveItem itemName >> {}", saveItem.getItemName());
	}
	
	@Test 
	void 모두삭제() {
		repository.clearStore();
		
		// 삭제 후 전체 검색 => 빈 list 리턴됨
		assertThat(repository.findAll()).isEmpty();
	}
	
	@Test
	void test() {
		/*
		 * [log level]
		 * default level : info
		 * trace > debug > info > warn > error
		 * trace 쪽으로 갈수록 로그 정보가 많음
		 * 개발 서버 : debug => application.properties에 logging.level.root=debug 추가해야 로그가 출력됨
		 * 운영 서버 : info
		 */
		
		String str = "log test...";
		log.trace("1. trace : {}", str);
		log.debug("2. debug : {}", str);
		log.info("3. info : {}", str);
		log.warn("4. warn : {}", str);
		log.error("5. error : {}", str);
	}
}
