import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {

		// 1. Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2-1. 문자열 입력: next() - 첫 번째 공백까지만 입력
		System.out.print("문자열 입력하세요...");
		String strOne = input.next();
		
		//버퍼 비우기
		input.nextLine();
		
		// 2-2. 문자열 입력: nextLine() - 엔터까지 입력
		System.out.print("문자열 입력하세요...");
		String strTwo = input.nextLine();
		
		// 3-1. 출력
		System.out.println("입력 받은 문자열 >> "+ strOne);
		
		// 3-2. 출력 
		System.out.println("입력 받은 문자열 >> "+ strTwo);
		
		
	}

}
