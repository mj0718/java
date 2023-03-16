package two;
import one.TestA;

public class TestC {
	// 객체 생성
	TestA a = new TestA();
	
	void show() {
//		System.out.println(a.num1); //private : 내부 접근만 허용
//		System.out.println(a.num2); //default : 같은 패키지만 허용
//		System.out.println(a.num3); //protected : 상속만 허용
		System.out.println(a.num4); //public 
	}
}
