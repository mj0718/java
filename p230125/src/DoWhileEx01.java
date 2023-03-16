/*
 *  [do while] 
 *  - 문법 
 *  do {
 *  	명령문;
 *  } while(조건식);
 *  -조건에 상관없이 반복문 처음 한번은 꼭 실행하고자 할 때
 */

public class DoWhileEx01 {

	public static void main(String[] args) {

		int idx = 1;

		// [while문] ========================================
		while (idx < 1) {
			System.out.println("idx >> " + idx);
			idx++;
		}

		// [do while문] =====================================
		do {
			System.out.println("idx >> " + idx);
			idx++;
		} while (idx < 3);

		System.out.println("반복문 실행 후 idx >> " + idx);
	}

}
