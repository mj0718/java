/*
 *  [조건문] if문
 *  
 *  <<조건 1개>>
 *  if (조건식) {
 *   	//조건이 true일 때, 실행되는 영역 명령어
 *  }
 *  
 *  <<조건 2개>>
 *  if (조건식) {
 *  	//조건이 true일 때, 실행되는 영역 명령어
 *  } else {
 *  	//조건이 False일 때, 실행되는 영역 명령어
 *  }
 *
 */

public class IfEx02 {

	public static void main(String[] args) {

		int num = 5;
		
		if (num > 5) {
			System.out.println("true일 때 실행되는 영역");
			num += 1;
		} else {
			System.out.println("false일 때, 샐행되는 영역");
			num*=2;
			
		}
		
		
		System.out.println("num >> "+num);
		
	}

}
