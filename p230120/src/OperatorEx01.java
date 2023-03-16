/*
 *  [삼항 연산자]
 *  변수 = (조건식) ? True일 때 : False일 때;
 */
public class OperatorEx01 {

	public static void main(String[] args) {

		//num의 값이 5 이상이면, 10을 저장
		//num의 값이 5 미만이면, 0을 저장
		int num = 5;
		
		int result = (num >= 5) ? 10 : 0;
		System.out.println("result >> " + result);
		
	}

}
