public class RecursionMethodQuiz {

//	public static int factorial(int num) {
//		int factorial =1;
//		
//		for (int i=1; i<=num; i++)
//			factorial*=i;
//		return factorial;
//	}

	// 재귀 메서드
	public static int factorial(int num) {
		if (num == 0)
			return 1;
		else
			return num * factorial(num - 1);
	}

	public static void main(String[] args) {
		System.out.println("5! = " + factorial(5));
	}
}
