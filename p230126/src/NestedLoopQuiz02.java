// 중첩 while문을 사용하여 구구단 2~9단을 출력하시오.

public class NestedLoopQuiz02 {
	public static void main(String[] args) {

		int i = 2;
		int j = 1;

		while (i < 10) {
			j = 1;
			while (j < 10) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
