// 컴퓨터가 생성한 랜덤값(1~10사이)을 몇 번만에 맞췄는지(횟수) 출력하시오.

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("*** 숫자를 맞추어 보세요(1~10) ***");

		int random = (int) (Math.random() * 10) + 1;
		int userNum = 0, count = 0;

		// [정답]
//		while (true) {
//			count++;
//			System.out.print("숫자 입력 : ");
//			userNum = input.nextInt();
//
//			if (random > userNum)
//				System.out.println("컴퓨터의 숫자가 더 큽니다.");
//			else if (random < userNum)
//				System.out.println("컴퓨터의 숫자가 더 작습니다.");
//			else
//				break;
//		}

		// [내 답안] 불필요하게 조건문을 여러 개 사용하여 가독성을 낮춤
		while (true) {
			count++; 
			System.out.print("숫자 입력 : ");
			userNum = input.nextInt();
//			if (userNum == random)
//				break;
//			else {
//				System.out.print("숫자 입력 : ");
//				userNum = input.nextInt();
			if (random < userNum )
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			else if (random > userNum)
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			else
				break;
//			count++; 이렇게 하면 횟수가 1씩 부족함 
//			}
		}
		input.close();
		System.out.println(count + "번만에 정답입니다.");
	}
}
