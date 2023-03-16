import java.util.Scanner;

public class IfQuiz02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("성별 1 또는 2를 입력하세요 >>> ");
		// 입력: 성별 - 1 또는 2
		int gender = input.nextInt();

		// 출력: 성별 출력 - 남자입니다. 여자입니다.
		if (gender == 1)
			System.out.println("남자입니다.");
		else if (gender == 2)
			System.out.println("여자입니다.");
		else
			System.out.println("잘못된 값을 입력하셨습니다.");

	}
}
