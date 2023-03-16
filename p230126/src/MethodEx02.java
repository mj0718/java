/*
 * [return 의미]
 * - 메소드 실행 끝
 * - 리턴값을 호출한 쪽으로 넘겨줌
 */
public class MethodEx02 {

	// 메소드 정의
	// [형태 2] 매개변수가 있고 리턴값 잇음
	// 기능: 인수 2개를 받은 후, 덧셈한 결과 리턴
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static void main(String[] args) {
		System.out.println("<< main method 시작 >>");
		int result=sum(2, 15);
		System.out.println("sum 호출 결과 : "+result);
		System.out.println("<< main method 종료 >>");
	}
}
