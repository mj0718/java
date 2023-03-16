package pattern;

/*
 * [디자인 패턴]
 * - 객체지향 언어의 장점들을 모아 가장 효율적으로 개발할 수 있게 만들어 놓은 툴
 * - singleton : 객체를 유일하게 하나만 생성(전역 개념)
 */

class Pattern {
	// field
	private static Pattern member_field = new Pattern();

	// 외부에서 객체 생성 불가능
	private Pattern() {
	}

	// method
	public static Pattern getPattern() {
		System.out.println("[Pattern class 내] member field >>" + member_field);
		return member_field;
	}

	@Override
	public String toString() {
		return "Pattern class";
	}
	// 멤버변수(field) i에 설정된 값을 외부에서 사용하는 방법
	//[방법 1]
//	private static int i = 100; 
//	// method
//	public static int getI() {
//		return i;
//	}
	//[방법 2]
	private int i=100;
	
	public int getI() {
		return this.i;
	}
}

public class SingleTon {
	public static void main(String[] args) {

		// Pattern p = new Pattern();
		// Pattern p = Pattern.member_field;
		// System.out.println(p);

		Pattern p = Pattern.getPattern();
		System.out.println(p);
		//System.out.println("멤버변수 i 값 >> "+Pattern.getI()); [방법 1]
		System.out.println("멤버변수 i 값 >> "+p.getI()); // [방법 2]
	}
}
