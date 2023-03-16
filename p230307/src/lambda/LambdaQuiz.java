package lambda;

@FunctionalInterface
interface MaxReturn {
	int max(int n1, int n2);

	default void method(int n1, int n2) {
		System.out.printf("매개변수 값 n1: %d, n2: %d\n", n1, n2);
	}
}

class SubMaxReturn implements MaxReturn {
	@Override
	public int max(int n1, int n2) {
		return (n1 > n2) ? n1 : n2;
	}
}

public class LambdaQuiz {
	public static void main(String[] args) {

		// [문제 1] 익명 클래스: 참조에 저장
		MaxReturn resultOne = new MaxReturn() {
			@Override
			public int max(int n1, int n2) {
				return (n1 > n2) ? n1 : n2;
			}
		};

		System.out.println("[익명 클래스] 큰 값 >> " + resultOne.max(5, 2));

		// [문제 2] 익명 클래스: 인수 - System.out.println()
		System.out.println(new MaxReturn() {
			@Override
			public int max(int n1, int n2) {
				return (n1 > n2) ? n1 : n2;
			}
		}.max(20, 41));

		// [문제 3] 문제 1을 람다로 표현
		MaxReturn resultTwo = (n1, n2) -> (n1 > n2) ? n1 : n2;
		System.out.println("[lambda] 큰 값 >> " + resultTwo.max(20, 15));

		// [문제 4] 문제 2를 람다로 표현 (불가능)
		// System.out.println(((MaxReturn)(n1, n2) -> (n1 > n2) ? n1 : n2).max(16, 10));

	}
}
