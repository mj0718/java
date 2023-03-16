
public class ArrayEx01CleanCode {
	public static void main(String[] args) {

		// 1. 배열 생성과 동시에 초기화: 반드시 길이 생략
		int[] math = new int[] { 80, 95, 90, 70, 100 };

		// 2. 배열 요소(원소)에 값 출력
		// 배열의 길이: 배열의 주소가 저장된 참조변수.length
		System.out.println("배열의 길이 >> " + math.length);

		// 일반 for문
		for (int i = 0; i < math.length; i++)
			System.out.println("math[" + i + "] >> " + math[i]);

		// 향상된 for문 (배열에서 사용)
		// [문법]
		// for(자료형 변수명: 배열의 참조변수) { 명령어; }
		for (int element : math)
			System.out.println(element);

	}
}
