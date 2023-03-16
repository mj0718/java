package exception;

public class Ex03 {
	public static void main(String[] args) {
		int[] arr = {2,4,6};
		try {
			arr[3]=10;
		} catch (ArithmeticException e) {
			System.out.println("분모가 0으로 계산 불능");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스 범위가 벗어났다!");
////			e.printStackTrace();
//			System.out.println(e.getMessage()); 
		} catch (Exception e) {
			System.out.println("Exception class가 처리함");
		}
		System.out.println("main method 종료");
	}
}
