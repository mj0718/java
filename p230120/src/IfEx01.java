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

public class IfEx01 {

	public static void main(String[] args) {

		int num = 5;
		
		if (num >= 5) {
			num += 1;
		}
		
		
		System.out.println("num >> "+num);
		
	}

}
