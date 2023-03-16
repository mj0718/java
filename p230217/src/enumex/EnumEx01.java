package enumex;

/*
 * [enum] 열거형
 * - JDK 1.5부터 지원
 * - 변수를 상수화
 * - 열거형 상수(constant)
 * - 멤버변수(field)를 모두 대문자 사용
 * - 관련 있는 상수(constant)를 하나의 이름으로 관리
 * - 첫 번째 멤버변수가 0부터 시작하여 1씩 자동으로 증가
 */

class Season {
	//하나의 객체를 생성하여, 상수로 사용하고 싶다.
	static final Season SPRING = new Season("봄");
	static final Season SUMMER = new Season("여름");
	static final Season FALL = new Season("가을");
	static final Season WINTER = new Season("겨울");
	
	//field
	private String name;
	//constructor
	private Season(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return this.name;
	}
}
public class EnumEx01 {
	public static void main(String[] args) { 
		System.out.println(Season.SPRING);
//		Season season = new Season("계절이다");
//		System.out.println(season);
		
		System.out.println(Season.SUMMER);
		System.out.println(Season.FALL);
		System.out.println(Season.WINTER);
	}
}
