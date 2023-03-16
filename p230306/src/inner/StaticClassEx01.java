package inner;

class OuterThree {
	static int age;

	static class InnerThree {
		// instance field
		int num = 5;

		// static field
		static int user = 10;

		// constructor
		public InnerThree() {
			System.out.println("[InnerThree class] 생성자 실행됨");
		}

		// instance method
		public void showNum() {
			System.out.println("[instance field] num >> " + num);
			System.out.println("[static field] user >> " + user);
		}

		// static method
		public static void showUser() {
			// System.out.println("[instance field] num >> " + num); Error
			System.out.println("[static field] user >> " + user);
		}
	}
}

public class StaticClassEx01 {
	public static void main(String[] args) {
		OuterThree.InnerThree in = new OuterThree.InnerThree();

		// instance method 호출
		in.showNum();

		// static method 호출
		OuterThree.InnerThree.showUser();
	}
}
