/*
 *  [메서드 정의]
 *  - 기능: 정수 1개를 받아서 제곱값 출력
 *  - 메서드명: square, 매개변수: 1개, 리턴값: 없음
 */
public class MethodQuiz02 {
	public static void square(int num) {
		System.out.println(num + "의 제곱은 " + num * num + "입니다.");
	}

	public static void main(String[] args) {
		square(2);
		square(5);
	}
}