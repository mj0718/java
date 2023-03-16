/*
 *  [메서드 정의]
 *  - 기능: 인수로 양의 정수 2개를 받아, 정수 사이의 누적합 계산 후 출력
 *  - 메서드명: add, 매개변수: 2개, 리턴값: 없음
 */
public class MethodQuiz01 {
	public static void add(int num1, int num2) {
		int sum = 0;
		int max, min;

		if (num1 < num2) {
			max = num2;
			min = num1;
		} else {
			max = num1;
			min = num2;
		}
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println(min + "~" + max + "의 누적합 >> " + sum);
	}

	public static void main(String[] args) {
		add(2, 5);
		add(5, 2);
	}
}