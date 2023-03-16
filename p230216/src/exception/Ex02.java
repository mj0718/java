package exception;

import java.util.Scanner;

/*
 * [예외]
 * - try ~ catch ~ finally : 직접 처리
 * - throws : 예외 전가
 */

public class Ex02 {
	public static void inputData() throws ArithmeticException{
		System.out.println("inputData method --- 시작");
		Scanner input = new Scanner(System.in);
		System.out.print("정수 2개 입력: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();

		int result1 = 0;
		int result2 = 0;

		result1 = n1 / n2;
		result2 = n1 % n2;
		System.out.println("몫 : " + result1);
		System.out.println("나머지 : " + result2);

		System.out.println("inputData method --- 종료");
	}

	public static void main(String[] args) {
		System.out.println("[main method] >>> START");
		try {
			inputData();
		} catch(ArithmeticException e) {
			System.out.println("[main method] 예외처리 - 부모가 0으로 계산 불능");
		}
		
		System.out.println("[main method] >>> END");
	}
}
