package inner;

class OuterFour {
	// instance method
	public void instanceMethod() {
		InnerStatic in = new InnerStatic();
		InnerInstance ins = new InnerInstance();
	}
	
	// static method
	public static void staticMethod() {
		InnerStatic in = new InnerStatic();
		//InnerInstance ins = new InnerInstance(); static이 메모리에 먼저 올라가기 때문
	}
	
	// inner class =================================
	class InnerInstance {
		
	}
	
	static class InnerStatic {
		
	}
}

public class StaticClassEx02 {
	public static void main(String[] args) {

	}
}
