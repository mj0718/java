import java.util.Scanner;

public class ScannerQuiz02 {

	public static void main(String[] args) {

		/*
		 * [문제] 
		 * 1. 정수를 하나 입력 받은 후 출력
		 * 2. 문자열 1개 입력 받은 후 출력
		 * 
		 */
		
		// 1. 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2. 정수 1개 입력
		System.out.print("정수 1개 입력하세요... ");
		int num = input.nextInt(); //숫자만 가져옴
		
		// 3. 입력 받은 정수 출력 
		System.out.println("입력 받은 정수 >> "+ num);
		
		// 4. 버퍼 비우기 (\r\n을 없애기 위해)
		input.nextLine(); 
		
		// 5. 문자열 1개 입력
		System.out.print("문자열 1개 입력하세요... ");
		String str = input.nextLine(); //Enter까지 가져옴
		
		// 6. 입력 받은 정수 출력
		System.out.println("입력 받은 문자열 >> "+ str);
		
	}

}
