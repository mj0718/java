// 사용자에게 가위, 바위, 보에 해당하는 정수를 입력 받고, 컴퓨터는 랜덤 값으로 설정하여 가위바위보하기

import java.util.Scanner;

public class SwitchQuiz03 {
	public static void main(String[] args) {

		// 자원 할당
		Scanner input = new Scanner(System.in);
		// 1. 입력
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력 >>> ");
		int user = input.nextInt();
		
		// 2. 랜덤값
		int computer = (int) (Math.random() * 3) + 1;
		
		// 3. 출력
		System.out.println("당신은 " + user + "입니다.");
		System.out.println("컴은 " + computer + "입니다.");
		
		// 4. 비교
		switch(user-computer) {
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
		}
		// 자원 해제 (이제 필요가 없으므로)
		input.close(); 
	}
}
