package inter;

interface Method {
	// method: public abstract;
	void one();

	public abstract void two();
	
	// java 8 부터 지원
	// [default method]
	default void method() {
		System.out.println("interface 내 default method");
	}
	// [static method]
	public static void staticMethod() {
		System.out.println("interface 내 static method");
	}
}

class Sub implements Method {

	@Override
	public void one() {
		System.out.println("오버라이딩된 메서드 one");
	}

	@Override
	public void two() {
		System.out.println("오버라이딩된 메서드 two");
	}

}

public class Ex03 {
	public static void main(String[] args) {
		Method m = new Sub();
		m.one();
		m.two();
		m.method();
		// interface 내 static method 호출 
		// m.staticMethod(); Error
		Method.staticMethod();
	}
}
