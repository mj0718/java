/*
 * [local inner class]
 * - method 내 정의된 클래스
 * - 접근 제어자 사용 불가능 - public, private 
 * => 메서드 내에서만 사용하기에 접근 권한이 불필요
 * - static 사용 불가능 -> static member 선언 불가능 -> 허용되지만 권장하지 않음
 * 
 */
package inner;

class OuterFive {

	// instance method
	public void show() {
		int age; // 지역변수

		// method 내 정의된 inner class -------------------------------
		class InnerFive {
			// instance field
			int num;

			// static field (비공식적 허용 - 권장하지 않음)
			static int age;
			
			// constructor
			public InnerFive() {
				this.num = 5;
				System.out.println("[InnerFive class] 생성자 실행됨");
			}

			// instance method
			public void showNum() {
				System.out.println("[InnerFive class] num >> " + num);
			}
		}
		// -------------------------------------------------------------

		// method 내 객체 생성
		InnerFive in = new InnerFive();
		in.showNum();
	}
}

public class LocalClassEx01 {
	public static void main(String[] args) {
		OuterFive out = new OuterFive();
		out.show();
	}
}
