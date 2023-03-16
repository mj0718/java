// WhileEx03의 코드에서 continue를 사용하지 않고, 같은 결과가 출력되도록 하시오.

public class WhileQuiz01 {
	public static void main(String[] args) {

		int idx = 0;

		while (idx < 10) {
			idx++;
			
			if (idx % 2 == 0)
				System.out.println("idx >> " + idx);
		}
		System.out.println("반복문 실행 후 idx >> " + idx);
		System.out.println("<< 프로그램 종료 >>");

	}
}
