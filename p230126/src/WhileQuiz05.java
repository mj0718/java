// 사용자에게 정수 1개를 입력 받아 누적합을 구하시오. 

import java.util.Scanner;

public class WhileQuiz05 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int total = 0;
		int userNum = 0;

		while (true) {
			System.out.print("정수를 입력하시오(종료 -1) >> ");
			userNum = input.nextInt();
			if (userNum == -1)
				break;
			total += userNum;
		}
		System.out.println("총합 >> " + total);
		input.close();
	}
}
