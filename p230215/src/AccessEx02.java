class Super {
	//field: 멤버 변수 - instance field, class(static) field
	private int numOne;
	int numTwo;
	
	//method: 멤버 메소드 - instance method, class(static) method
	void showOne() {
		System.out.println("showOne() 실행됨");
	}
	public void showTwo() {
		System.out.println("showTwo() 실행됨");
	}
}
class Sub extends Super {
	// 부모의 멤버변수 접근
	public void setNumOne() {
		//super.numOne=1; 자식이여도 접근 불가능
	}
	public void setNumTwo() {
		super.numTwo=2;
	}
	// method overriding
	void showOne() {
		System.out.println("==============================");
		System.out.println("오버라이딩된 showOne() 실행됨");
		System.out.println("==============================");
	}
	/*
	 * [overriding된 메서드의 접근 권한]
	 * 상속관계에서 overriding된 메서드의 접근권한은
	 * 부모의 접근권한보다 크거나 같아야 함
	 */
	public void showTwo() {
		System.out.println("오버라이딩된 showTwo() 실행됨");
	}
}

public class AccessEx02 {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.showOne();
		s.showTwo();
	}
}
