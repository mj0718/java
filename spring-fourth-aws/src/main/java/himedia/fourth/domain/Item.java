package himedia.fourth.domain;

import lombok.Getter;
import lombok.Setter;

//@Data
@Setter @Getter
public class Item {
	private Long id;
	private String itemName;
	private Integer price;
	private Integer quantity;
	
	// constructor
	public Item() { }

	public Item(String itemName, Integer price, Integer quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
}
