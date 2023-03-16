// 정수 2개와 사칙연산의 기호를 입력 받아서, 식을 출력하시오. 
// 단, 정수를 먼저 입력 받으시오.

import java.util.Scanner;

public class SwitchQuiz02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("정수 2개를 입력하시오...");
		int num1 = input.nextInt(), num2 = input.nextInt();

		System.out.print("사칙연산(+, -, *, /) 중 하나를 입력하시오...");
		String operator = input.next();
		String expression = num1 + operator + num2 + "="; // 공통적으로 겹치는 부분만 미리 선언

		switch (operator) {
		case "+":
			System.out.println(expression + (num1 + num2));
			break;
		case "-":
			System.out.println(expression + (num1 - num2));
			break;
		case "*":
			System.out.println(expression + (num1 * num2));
			break;
		case "/":
			System.out.println(expression + (num1 / num2));
			break;
		default:
			System.out.println("잘못된 연산자를 입력하셨군요!!");
			break;
		}
	}
}
