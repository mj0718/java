// 사용자에게 정수 하나를 입력 받아, 팩토리얼 값을 구하시오. (1~10만 입력가능, 이외의 값을 입력하면 다시 입력받기)

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int userValue = 0;
		int result = 1;

		// [정답]
//		do {
//			System.out.print("1~10 사이의 정수 입력 : ");
//			userValue = input.nextInt();
//		} while (userValue < 1 || userValue > 10);
//
//		for (int i = 1; i <= userValue; i++) {
//			result *= i;
//		}

		// [내 답안] 
		while (true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = input.nextInt();
			if (userValue < 1 || userValue > 10)
				continue;
			else
//				for (int i = 1; i <= userValue; i++) {
//					result *= i;
//				} 반복문 안에 또 반복문이 있어 좋지 않음 
			break;
		}
		for (int i = 1; i <= userValue; i++) {
			result *= i;
		}

		input.close();
		System.out.println(userValue + "! : " + result);
	}
}
