package himedia.fourth.repository;

import java.util.List;
import java.util.Optional;

import himedia.fourth.domain.Item;

public interface ItemRepository {
	Item save(Item item);
	Optional<Item> findById(Long id);
	Optional<Item> findByName(String name);
	List<Item> findAll();
	Item update(Long itemId, Item updateItem);
	void clearStore();
}
