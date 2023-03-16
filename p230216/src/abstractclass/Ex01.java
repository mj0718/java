package abstractclass;

/*
 * [추상 클래스]
 * - 추상 클래스 내 추상 메서드는 있을 수도 있고 없을 수도 있음
 * - 추상 클래스는 객체 생성 불가능 
 * - 다형성(Type) 또는 상속 용도
 * 
 * 
 * [추상 메서드]
 * - body가 없는 메서드 -> 미완성(불완전) 메서드
 * - 반드시 추상 클래스 내 존재
 * - 추상 클래스를 상속 받은 자식 클래스는 반드시 추상 메서드를 오버라이딩해야 함 -> 강제성
 * - 오버라이딩한 메서드의 접근 권한은 부모의 추상 메서드의 접근 권한보다 크거나 같아야 함
*/
abstract class Parent {
	// field
	private int num;

	// abstract method: 추상 메서드
	abstract public void methodOne();

	// instance method
	public void methodTwo() {
		System.out.println("일반 메서드");
	}

	// static(class) method
	public static void methodThree() {
		System.out.println("static method");
	}
}

class Child extends Parent {
	@Override
	public void methodOne() {
		System.out.println("오버라이딩된 추상 메서드");
	}
}

public class Ex01 {
	public static void main(String[] args) {

		// 1. 추상 클래스는 객체 생성할 때, 에러 발생
		// Parent p = new Parent();

		// 2. 추상 클래스를 Type으로 사용: 참조변수 선언
		Parent p;

		// 3. 자식 클래스는 객체 생성 가능
		Child c = new Child();
		c.methodOne();

		// 4. 다형성
		Parent pr = new Child();
		pr.methodOne();
	}
}
