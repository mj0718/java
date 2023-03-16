// 짝수 단과 홀수 단을 0과 1로 입력 받아서 출력

import java.util.Scanner;

public class NestedLoopQuiz04 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("짝수 단은 0, 홀수 단은 1을 입력 : ");

		int userNum = input.nextInt();
		int start = (userNum == 0) ? 2 : 3;

		for (int i = start; i < 10; i += 2) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
		input.close();
	}
}
