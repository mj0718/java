/*
 *  [메서드 정의]
 *  - 기능: 정수 1개를 입력 받아서 팩토리얼 출력
 *  - 메서드명: factorial, 매개변수: 1개, 리턴값: 있음
 */
public class MethodQuiz04 {
	public static int factorial(int num) {
		int result = 1;
		if (num == 0) {
			result = 1;
		} else {
			for (int i = 1; i <= num; i++) {
				result *= i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("5! = " + factorial(5));
	}
}
