// 1~10까지 합을 구하시오.

public class WhileQuiz03 {
	public static void main(String[] args) {

		int sum = 1, result = 0;

		while (sum < 11) {
			
			result += sum;
			sum++;
		}
		System.out.println("1~10 누적합 : " + result);
	}
}
