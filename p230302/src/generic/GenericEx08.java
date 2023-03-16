package generic;

// [제네릭 인터페이스의 상속]
// 제네릭 인터페이스
interface Space<T> {
	void youKnow(T item);
}
// 제네릭 클래스
class Star<T> implements Space<T> {

	@Override
	public void youKnow(T item) {
		System.out.println(item + "은 항성이다");
	}
}
class Sun {
	@Override
	public String toString() {
		return "태양";
	}
}

public class GenericEx08 {
	public static void main(String[] args) {
		Star<Sun> star = new Star<Sun>();
		star.youKnow(new Sun());
	}
}
