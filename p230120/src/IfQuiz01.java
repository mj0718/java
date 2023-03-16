// if문을 사용하여 큰 값, 작은 값을 출력하시오.
// (단, 같은 정수는 넣을 수 없음)

public class IfQuiz01 {
	public static void main(String[] args) {

		int num1 = 11, num2 = 5;

		// [첫 번째 방법] =================================================
//		if (num1 > num2)
//			System.out.println("큰 값 : " + num1 + ", 작은 값 : " + num2);
//		else if (num1 < num2)
//			System.out.println("큰 값 : " + num2 + ", 작은 값 : " + num1);

		// [두 번째 방법] =================================================
		int max, min;

		if (num1 > num2) {
			max = num1;
			min = num2;
		} else { //else if로 하면 max, min 초기화 오류 뜸
			max = num2;
			min = num1;
		}

		System.out.println("큰 값 : " + max + ", 작은 값 : " + min);

	}
}
