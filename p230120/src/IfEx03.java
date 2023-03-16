/*
 *  [조건문] if문
 *  
 *  <<조건 1개>>
 *  if (조건식) {
 *   	//조건이 True일 때, 실행되는 영역 
 *   	명령어;
 *  }
 *  
 *  <<조건 2개>>
 *  if (조건식) {
 *  	//조건이 True일 때, 실행되는 영역 
 *  	명령어;
 *  } else {
 *  	//조건이 False일 때, 실행되는 영역 
 *  	명령어;
 *  }
 *  
 *  <<조건 3개>>
 *  if (조건식1) {
 *  	//조건식1이 True일 때, 실행되는 영역 
 *  	명령어;
 *  } else if (조건식2) {
 *  	//조건식2가 True일 때, 실행되는 영역 
 *  	명령어;
 *  } else {
 *  	//위 조건을 만족하지 않는 나머지 모두
 *  	명령어;
 *  }
 */

public class IfEx03 {

	public static void main(String[] args) {

		int num = 2;
		
		if (num > 5) {
			System.out.println("num이 5보다 크다.");
		} else if (num < 5) {
			System.out.println("num이 5보다 작다.");
		} else {
			System.out.println("num이 5와 같다.");
		}
		
		
		System.out.println("num >> "+num);
		
	}

}
