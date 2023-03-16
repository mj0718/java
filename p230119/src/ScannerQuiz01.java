import java.util.Scanner;

public class ScannerQuiz01 {

	public static void main(String[] args) {
		
		// 1. 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2. 정수 입력
		System.out.print("정수 2개를 입력하세요...");
		
		int valueOne = input.nextInt();
		int valueTwo = input.nextInt();
		
		// 3. 덧셈 결과 출력
		System.out.println("덧셈 결과 >> "+ (valueOne+valueTwo));
		
		
	}

}
