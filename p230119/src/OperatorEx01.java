
public class OperatorEx01 {

	public static void main(String[] args) {

		// 대입 연산자 ===============================
		int num = 5;
		System.out.println("num : "+num);
		
		// 산술 연산자 ===============================
		//int n1 = 5;
		//int n2 = 3;
		int n1= 5, n2= 3;
		System.out.println("덧셈 : "+(n1+n2));
		System.out.println("뺄셈 : "+(n1-n2));
		System.out.println("곱셈 : "+(n1*n2));
		System.out.println("몫 : "+(n1/n2));
		System.out.println("나머지 : "+(n1%n2));
		
		// 복합 대입 연산자 ==========================
		//n1 = n1+n2;
		n1 += n2;
		System.out.println("n1 : "+n1+", n2 : "+n2);
		
	}

}
