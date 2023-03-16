// for문을 사용하여 구구단 2단을 출력하시오.

public class ForQuiz01 {
	public static void main(String[] args) {

		// [첫 번째 방법]
		for (int num = 1; num <= 10; num++) {
			if (num % 2 == 0) {
				System.out.println("2 * " + num + " = " + (num * 2));
			}
		}

		// [두 번째 방법]
		for (int idx = 2; idx < 11; idx += 2) {
			// System.out.println("2 * " + idx + " = " + (2 * idx));
			System.out.printf("2 * %d = %d\n", idx, 2 * idx);
		}

		// [서식문자]
		// %d: 정수 %f: 실수 %c: 문자 %s: 문자열
		System.out.printf("정수 : %d\n", 2);
		System.out.printf("실수 : %.1f\n", 2.6);
		System.out.printf("문자 : %c\n", 'b');
		System.out.printf("문자열 : %s\n", "좋은 하루");

		int n1 = 65, n2 = 97;
		System.out.printf("[첫 번째] %d, %d\n", n1, n2);
		System.out.printf("[두 번째] %c, %c\n", n1, n2);
		// System.out.printf("[세 번째] %f, %f\n",n1,n2);
		System.out.printf("[네 번째] %s, %s\n", n1, n2);

	}
}
