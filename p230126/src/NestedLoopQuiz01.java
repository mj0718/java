// 중첩 for문을 사용하여 구구단 2~9단을 출력하시오.

public class NestedLoopQuiz01 {
	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
	}
}
