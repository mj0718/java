class Number {
	// instance field : heap 영역 할당 | 객체가 생성될 때
	// static field : static 영역 할당 | class가 메모리에 로드될 때
	static int one = 100;
	int two;

	// static method : static 영역 할당 | class가 메모리에 로드될 때
	static void staticShow() {
		System.out.printf("one : %d\n", one);
	}

	// instance method : heap 영역 할당 | 객체가 생성될 때
	void show() {
		System.out.printf("one : %d, two : %d\n", one, two);
	}
}

public class VariableEx03 {
	public static void main(String[] args) {
		// static field 접근
		// [문법] 클래스명.변수명
		System.out.println("static field >> " + Number.one);

		// static method 접근
		// [문법] 클래스명.메소드명()
		Number.staticShow();

		// 객체 생성
		Number number = new Number();
		// instance field 접근
		// [문법] 참조변수.변수명
		System.out.println("instance field >> " + number.two);
		System.out.println("[권장 X] 참조변수를 통한 static 멤버 접근 >> " + number.one);
		// instance method 접근
		// [문법] 참조변수.메소드명()
		number.show();
	}
}
