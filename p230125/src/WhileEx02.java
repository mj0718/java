/*
 * 1. 무한 루프(loop)
 * - 문법: while(true)
 * - 좋다, 나쁘다의 개념으로 접근하는 것이 아님
 * - 반복문 내에 break 명시
 * 
 * 2. break
 * - 반복문 내에서 조건문과 함께 사용
 * - 의미: 반복문 탈출
 * 
 */

public class WhileEx02 {
	public static void main(String[] args) {

		int idx = 1;

		// 무한 루프문(반복문) 구현 =============================
//		while (true) {
//			System.out.println("idx >> " + idx);
//			if(idx == 3)
//				break;
//			idx++;
//		}

		// 위 [무한 루프문]을 [조건식이 있는 while문]으로 변경====

		while (idx <= 3) {
			System.out.println("idz >> " + idx);
			idx++;
		}
		System.out.println("반복문 실행 후 idx >> " + idx);
		System.out.println("<< 프로그램 종료 >>");
	}
}
