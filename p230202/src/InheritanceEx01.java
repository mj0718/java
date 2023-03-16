// 다중 상속: 부모가 2개 이상 => 자바는 다중 상속 불가능
// 단일 상속: 부모가 1개 => 자바는 단일 상속만 허용
class Parent {
	// instance field
	int money = 1_000_000;

	// constructor
	public Parent() {
		this.money = 1_000_000;
		System.out.println("[Parent] 매개변수가 없는 생성자 실행됨");
	}

	public Parent(int money) {
		this.money = money;
		System.out.println("[Parent] 매개변수가 1개인 생성자 실행됨");
	}

	// instance method
	void buy(int money) {
		this.money -= money;
		System.out.println("남은 돈은 " + this.money + "입니다.");
	}
}

class Child extends Parent {
	public Child() {
		// super(); 매개변수가 없는 것은 자동으로 생김
		System.out.println("[Child] 매개변수가 없는 생성자 실행됨");
	}

	public Child(int money) {
		super(money);
		System.out.println("[Child] 매개변수가 1개인 생성자 실행됨");
	}

	// instance method
	/*
	 * [메소드 오버라이딩] method overriding - 상속관계에서 자식(sub) class가 부모(super) class의 멤버
	 * 메소드를 재정의 - 부모 class의 멤버 메소드에서 선언부는 그대로, 바디(기능)만 수정 - 반환형, 메소드명, 매개변수 정보가 같아야함
	 * 
	 * [메소드 오버로딩] - 같은 이름의 메소드를 여러 개 정의 - 단, 매개변수의 정보가 달라야함 - 반환형과는 관련 없음
	 */
	void buy(int money) {
		System.out.println("용돈은 " + money + "원입니다.");
	}
}

public class InheritanceEx01 {
	public static void main(String[] args) {
		System.out.println("1. Child 객체 생성 : new Child()");
		Child c = new Child();
		c.buy(100_000);

		System.out.println("\n2. Child 객체 생성 : new Child(500_000)");
		Child c2 = new Child(500_000);
		c2.buy(50_000);
	}
}
