package polymorphism;

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	// 길이가 10인 배열에 구매한 가전 정보 저장 후 summary를 통해 정보 출력
	Product[] im = new Product[10];
	int idx = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하였습니다.");
		im[idx++] = p;

	}

	void summary() {
		int total = 0;
		String name = "";

		for (int i = 0; i < im.length; i++) {
			if (im[i] == null)
				break;
			total += im[i].price;
			name += im[i].toString() + ", ";
		}
		System.out.println("구입하신 물품의 총 금액은 " + total + "만원입니다.");
		System.out.println("구입하신 제품은 " + name + "입니다.");

	}
	// for(int i =0; i<idx; i++)
	// System.out.print(im[i] + ", ");

	// for(Product i : im)
	// System.out.println(i);
}

public class Ex02 {
	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Tv());
		b.summary();

	}
}