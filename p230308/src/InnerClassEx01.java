class Outer {
	private int one = 1;
	private int two = 2;
	private int three = 3;

	class Inner {
		private int one = 100;
		private int two = 200;

		public void showMember() {
			System.out.println("[Inner class] one >> " + one);
			System.out.println("[Inner class] two >> " + this.two);
			System.out.println("three >> " + three);
			System.out.println("[Outer class] one >> " + Outer.this.one);
			System.out.println("[Outer class] two >> " + Outer.this.two);
		}
	}
}

public class InnerClassEx01 {
	public static void main(String[] args) {
		// 객체 생성 후 showMember() 호출
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.showMember();

	}
}
