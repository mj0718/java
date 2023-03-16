/*
 *  [메서드 정의]
 *  - 기능: 정수 2개를 받아서 몫 출력
 *  - 메서드명: divide, 매개변수: 2개, 리턴값: 없음
 */
public class MethodQuiz03 {
	public static void divide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("분모가 0으로 계산 불능");
		} else {
			System.out.println("나눗셈 결과 >> " + num1 / num2);
		}
	}

	public static void main(String[] args) {

		divide(5, 3);
		divide(4, 0);
		divide(6, 2);

	}
}