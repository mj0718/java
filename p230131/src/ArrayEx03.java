
public class ArrayEx03 {
	public static void main(String[] args) {

		// 2차원 배열 생성
		// 열 길이는 생략 가능 but 행 길이는 생략 불가능
		int[][] arr2 = new int[2][];

		System.out.println("arr2[0] >> " + arr2[0]);
		System.out.println("arr2[1] >> " + arr2[1]);

		// 열 : 1차원 배열 생성
		arr2[0] = new int[2];
		arr2[1] = new int[] { 8, 10, 12 };

		for (int[] ar : arr2) {
			for (int a : ar) {
				System.out.print(" " + a);
			}
			System.out.println();
		}

	}
}
