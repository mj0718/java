
public class NestedLoopEx02 {
	public static void main(String[] args) {
		outer: for (int i = 0; i < 3; i++) {
			System.out.println("[바깥쪽 for문] " + (i + 1) + "차 회전");

			for (int j = 0; j < 3; j++) {
				System.out.println("\t[안쪽 for문] " + (j + 1) + "차 회전");

				if (i % 2 == 0)
					break outer; // 원래는 안쪽 for문만 빠져나갈 수 있지만 바깥쪽 for문을 빠져나가기 위해서 이름 붙여줌
			}

			System.out.println();
		}
		System.out.println("<< 실행 완료 >>");
	}
}
