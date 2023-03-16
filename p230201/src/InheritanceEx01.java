class Parent {
	// instance field
	int money = 1_000_000;

	public Parent() {
		System.out.println("[Parent] 생성자 실행됨");
	}

	// instance method
	void buy(int money) {
		this.money -= money;
		System.out.println("남은 돈은 " + this.money + "입니다.");
	}
}

class Child extends Parent {
	public Child() {
		// super(); 부모 생성자 호출
		System.out.println("[Child] 생성자 실행됨");
	}
}

public class InheritanceEx01 {
	public static void main(String[] args) {

		Child c1 = new Child();
		c1.buy(100000);

	}
}
