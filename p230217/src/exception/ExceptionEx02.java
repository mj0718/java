package exception;

/*
 * [예외처리]
 * 1. 직접 : try ~ catch
 * 2. 전가 : throws
 */

// [두 번째 방법] 전가
public class ExceptionEx02 {
	public static void main(String[] args) throws InterruptedException {

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000); 
		}
	}
}
