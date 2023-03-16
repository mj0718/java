// 1~10사이의 정수 1개를 입력 받은 후 랜덤값에서 사용자가 입력한 정수 찾기 

import java.util.Scanner;

public class WhileQuiz04 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("1~10 사이의 정수 1개 입력 >> ");
		int userNum = input.nextInt();
		int random = 0;
		int count = 1;

		while (true) {
			random = (int) (Math.random() * 10) + 1;
			System.out.print(random + " ");
			
			if (userNum == random)
				break;
			count++;

		}
		System.out.print("\n" + count + "회 실행해서 찾았다!");
		input.close();
	}
}
