package polymorphism;

class Fruit {
	// field
	String name;
	int count;

	// constructor
	public Fruit() {
	}

	public Fruit(String name, int count) {
		this.name = name;
		this.count = count;
	}

	// method
	public void show() {
		System.out.println("부모 클래스 Fruit입니다.");
	}
}

class Banana extends Fruit {
	// 생성자
	public Banana(String name, int count) {
		super(name, count);
	}

	@Override
	public String toString() {
		return "바나나는 멸종 위기이다";
	}

	public void nameAndCount() {
		System.out.println("현재 과일은 " + super.name + "입니다.");
		System.out.println("개수는 " + super.count + "개 있습니다.");
	}
}

class Apple extends Fruit {

	public Apple(String name, int count) {
		super(name, count);
	}

	@Override
	public String toString() {
		return "나는 사과다";
	}

	public void showInfo() {
		System.out.println(">>> 사과 종류는 " + super.name + "입니다.");
		System.out.println(">>> 수량은 " + super.count + "개 입니다.");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// Banana banana = new Banana("레드 바나나", 10);
		// System.out.println(banana);
		fruitInfo(new Banana("레드 바나나", 10));

//		Apple apple = new Apple("홍옥", 5);
//		System.out.println(apple);
		fruitInfo(new Apple("홍옥", 5));
		
	}

	// method 정의
	public static void fruitInfo(Fruit fruit) {
		System.out.println("== fruitInfo 메서드 시작 ==");
		System.out.println(fruit.toString());
		fruit.show();
		// nameAndCount 메서드 호출
		// 우선순위 때문에 소괄호를 해줘야함
		if (fruit instanceof Banana)
			((Banana) fruit).nameAndCount();
		else if (fruit instanceof Apple)
			((Apple) fruit).showInfo();
		System.out.println("== fruitInfo 메서드 종료 ==");
	}
}
