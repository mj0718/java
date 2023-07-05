package himedia.fourth.domain;

import lombok.Getter;
import lombok.Setter;

//@Data   getter, setter 둘다 처리해줌 but, 여러 어노테이션이 포함되어 있어 원치 않은 어노테이션이 있을 수 있어 주의해서 사용해야 함
@Getter @Setter
public class Item {
	private Long id;
	private String itemName;
	private Integer price;
	private Integer quantity;
	
	// constructor
	public Item() {}

	public Item(String itemName, Integer price, Integer quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
}