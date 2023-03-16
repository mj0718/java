// 학점을 출력하는 코드를 작성하시오. (점수 범위는 0~100점까지)

import java.util.Scanner;

public class IfQuiz05 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("점수를 입력하세요 >> ");
		int score = input.nextInt();

		// [첫 번째 방법] ==================================================
		char grade = ' ';
		char option = '0';

		if (score % 10 >= 7 || score == 100)
			option = '+';
		else if (score % 10 <= 3)
			option = '-';

		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else {
			grade = 'F';
			option = ' ';
		}
		System.out.println("당신의 학점은 " + grade + option + "입니다.");

		// [두 번째 방법] ==================================================
//		String result = "";
//
//		if (score > 89) {
//			if (score > 96)
//				result = "A+";
//			else if (score > 93)
//				result = "A0";
//			else
//				result = "A-";
//		} else if (score > 79) {
//			if (score > 86)
//				result = "B+";
//			else if (score > 83)
//				result = "B0";
//			else
//				result = "B-";
//		} else if (score > 69) {
//			if (score > 76)
//				result = "C+";
//			else if (score > 73)
//				result = "C0";
//			else
//				result = "C-";
//		} else
//			result = "F";
//
//		System.out.println("당신의 학점은 " + result + "입니다.");

	}
}
