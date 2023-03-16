public class InstanceEx04 {
	public static void increment(int num) {
		System.out.println("증가 전 num >> " + num);
		num++;
		System.out.println("증가 후 num >> " + num);
	}

	public static void main(String[] args) {
		int num = 5;
		System.out.println("메소드 호출 전 : " + num);
		
		increment(num);
		System.out.println("메소드 호출 후 : " + num);

	}
}
