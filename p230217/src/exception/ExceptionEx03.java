package exception;

import java.util.Scanner;

class Check extends Exception {
	/**
	 * [직렬화]
	 */
	private static final long serialVersionUID = 1L;
	int num;

	public Check(int num) {
		super("[예외 발생] 음수 값을 입력하셨군요!");
		this.num = num;
	}
}

public class ExceptionEx03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요...");

		int userValue = input.nextInt();
		input.close();
		try {
			if (userValue < 0) {
				// 예외 발생 : throw
				throw new Check(userValue);
			}
		} catch (Check check) {
			//System.out.println(check); 클래스명까지 출력
			System.out.println(check.getMessage());  //메세지만 출력
		}
		System.out.println("입력된 값 >> " + userValue);
	}
}
