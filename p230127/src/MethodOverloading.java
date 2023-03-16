/*
 * [ 메소드 오버로딩]
 * - 같은 이름의 메소드를 여러 개 정의
 * - 단, 매개변수의 정보(개수, 자료형)가 달라야 함
 * - 반환형(리턴형)과는 관련 없음
 */
public class MethodOverloading {

	// [method 정의] =============================
	// 기능: 정수 2개를 받아서, 덧셈 결과 출력
	public static void sum(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("덧셈 결과 >> " + result);
	}

	public static void sum(double n1, double n2) {
		double result = n1 + n2;
		System.out.println("덧셈 결과 >> " + result);
	}

	public static void main(String[] args) {
		sum(2, 3);
		sum(1.2, 3.4);
	}
}
