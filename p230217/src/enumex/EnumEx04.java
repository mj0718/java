package enumex;

enum Number {
	// enum constant
	ONE(1), TWO(2), THREE(3), FOUR(4);

	// field
	int num;

	// 생성자
	Number(int num) {
		this.num = num;
	}

	// getter method
	public int getNum() {
		return this.num;
	}
}

public class EnumEx04 {
	public static void main(String[] args) {
		System.out.println("Number.ONE >> "+Number.ONE);
		Number currentNumber = Number.ONE;
		switch(currentNumber) {
		case ONE:
			System.out.println("1이다");
			break;
		case TWO:
			System.out.println("2이다");
			break;
		case THREE:
			System.out.println("3이다");
			break;
		case FOUR:
			System.out.println("4이다");
		}
		
		// 서수 출력 (설정된 정수 값 출력
		System.out.println("<< 서수 출력 >>");
		for (Number n : Number.values())
			System.out.println(n.ordinal());
		
		// getter 실행하여 멤버 변수에 설정된 값 출력
		System.out.println("<< 설정된 멤버변수 값 출력 >>");
		for (Number n : Number.values())
			System.out.println(n.getNum());
	}
}
