/*
 * [익명 클래스] 이름 없는 클래스
 * << 형태 >>
 * 1. 클래스 확장
 * 2. 인터페이스 구현
 * 3. 인수 
 */

package anonymous;

class Super {
	public void info() {
		System.out.println("[Super class] info() 실행됨");
	}
	public void greeting() {
		System.out.println("좋은 아침");
	}
}
class Sub extends Super {
	// constructor
	public Sub() {
		System.out.println("[Sub class] 생성자 실행됨");
	}
	
	// instance method
	public void show() {
		System.out.println("[Sub class] show() 실행됨");
	}
}
public class AnonymousEx01 {
	public static void main(String[] args) {
		
		// 1. 다형성
		//Super s = new Sub();
		
		// 2-1. [익명 클래스] 클래스 확장
		Super anonymous = new Super() {
			// 생성자 불가능 -> 클래스명이 없어서
			
			// 메서드 재정의
			@Override
			public void info() {
				System.out.println("[anonymous class] 오버라이딩된 메서드 info()");
			}
			
			// instance method: 클래스 내부에서만 사용 가능 => 외부 호출 불가능
			public void say() {
				System.out.println("나는 익명클래스야");
			}
		};
		
		// 2-2. 메서드 호출
		anonymous.info();
		//anonymous.say();
		anonymous.greeting();
	}
}














