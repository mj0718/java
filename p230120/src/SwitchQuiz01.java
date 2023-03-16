// 계절을 출력하는 코딩을 작성하시오.

import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("현재 월을 입력하세요 >>> ");
		int month = input.nextInt();

		// [첫 번째 방법] =============================================
		String season ="";
		switch(month) {
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
		}
		System.out.println("현재 계절은 " + season + "입니다.");
		
		// [두 번째 방법] ==============================================
//		String result = "";
//
//		switch (month / 3) {
//		case 1:
//			result = "봄";
//			break;
//		case 2:
//			result = "여름";
//			break;
//		case 3:
//			result = "가을";
//			break;
//		default:
//			result = "겨울";
//		}
//		System.out.println("현재의 계절은 " + result + "입니다.");
	}
}
