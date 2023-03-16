
public class ArrayEx02CleanCode {
	public static void main(String[] args) {

		// [1차원 배열]: 길이가 1개인 배열
		// int형의 길이가 5인 1차원 배열 arr 생성
		int[] arr = new int[] {2,4,6,8,10};

		// 1. [2차원 배열]: 길이가 2개인 배열
		// 2차원 배열 생성과 동시에 초기화
		//int[][] arr2 = new int[][] {{2,4},{8,10,12}};
		int[][] arr2 = {{2,4},{8,10,12}};
		
		System.out.println("행의 길이 >> "+arr2.length);
		System.out.println("첫 번째 행의 열 길이 >> "+arr2[0].length);
		System.out.println("두 번째 행의 열 길이 >> "+arr2[1].length);
		

		// 향상된 for문
		for (int[] i : arr2) {
			for (int j : i) {
				System.out.print(" " + j);
			}
			System.out.println();
		}

	}
}
