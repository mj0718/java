/*
 * [Generic]
 * : type을 일반화(generalize)한다.
 * : type이 컴파일할 때 결정
 * : generic은 type을 외부에서 결정(지정)함
 * : JDK 1.5부터 도입(지원)
 * 
 */

class Test<T> {
	private T element;

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}
}

public class GenericEx01 {
	public static void main(String[] args) {

		Test<Integer> t = new Test<Integer>();
		t.setElement(5);
		System.out.println(t.getElement());

		Test<String> str = new Test<String>();
		str.setElement("안녕");
		System.out.println("str >> " + str.getElement());
	}
}
