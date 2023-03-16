package exception;

/*
 * [예외처리]
 * 1. 직접 : try ~ catch
 * 2. 전가 : throws
 */

// [첫 번째 방법] 직접 처리
public class ExceptionEx01 {
	public static void main(String[] args) {

		for (int i = 10; i > 0; i--) {
			System.out.println(i);

			try {
				Thread.sleep(1000); // 1초 멈추고 출력
			} catch (InterruptedException e) {
				//
			}
		}
	}
}
