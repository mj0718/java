import java.util.Scanner;

public class IfEx04 {

	public static void main(String[] args) {

		// 사용자가 입력한 정수를 짝수/홀수 구분하여 출력
		
		// 1. 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2. 정수 1개 입력
		System.out.print("정수 1개 입력하세요: ");
		int user_value = input.nextInt();
		
		// 3-1. [if문] 짝수/홀수 구분 =============================
//		String result ="";
//		
//		if (user_value % 2 == 0)
//			result = "짝수";
//		else 
//			result = "홀수";
		
		// 3-2. [조건 연산자] 짝수/홀수 구분 =======================
		String result = (user_value % 2 == 0) ? "짝수" : "홀수";
		
		// 4. 출력
		System.out.println("입력한 값은 " + result + "입니다.");
	}
}
