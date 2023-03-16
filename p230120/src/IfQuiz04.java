// 점수를 입력 받은 후, 학점을 출력하시오. (점수 범위는 0~100점까지)

import java.util.Scanner;

public class IfQuiz04 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("점수를 입력하세요 >> ");
		int score = input.nextInt();

		char result = ' ';

		if (score > 89)
			result = 'A';
		else if (score > 79)
			result = 'B';
		else if (score > 69)
			result = 'C';
		else
			result = 'D';

		System.out.println("당신의 학점은 " + result + "입니다.");

	}
}
