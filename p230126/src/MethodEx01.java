/*
 *  [method] 메서드, 메소드
 *  - 기능, 동작
 *  - 메소드를 만드는 것을 "메소드를 정의한다"라고 함
 *  - 메소드는 정의 한 후, "호출"해야 실행됨
 *  - 메소드는 여러 번 호출 가능함
 */

public class MethodEx01 {
	
	// 메소드 정의 
	// [형태 1] 매개변수 있고, 리턴값 없음
	public static void increment(int num) {
		num++;
		System.out.println("1 증가한 값 >> "+num);
	}
	
	public static void main(String[] args) {
		System.out.println("<< main method 시작 >>");
		int num = 100;
		
		increment(5); // 메소드 호출
		
		System.out.println("num : "+num);
		System.out.println("<< main method 종료 >>");
		
	}
}
