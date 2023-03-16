package two;

import one.TestA;

public class TestE extends TestA{
	// 멤버 메서드
	void show() {
//		System.out.println(num1); //Error private
//		System.out.println(num2); //Error default
		System.out.println(num3); //protected
		System.out.println(num4); //public
	}
}
