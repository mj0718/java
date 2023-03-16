package inter;

interface A {}
interface B {}
interface C extends A{}
interface D extends A, B {} //다중 상속 허용 

class E {}
class F {}
class G extends E {}
//class H extends E, F {} //다중 상속 불가능
//class I extends A {} //Error
class J implements A {}
class K extends E implements A, B {}
//class L implements A extends E {} //Error 같은 타입이 먼저 와야함
//interface M implements E {} //Error 인터페이스의 부모로 클래스 둘 수 없음

public class Ex01 {
	public static void main(String[] args) {

	}
}
