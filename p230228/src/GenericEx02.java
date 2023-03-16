/*
 * [제네릭 메서드]
 * 
 */
class Apple {
	@Override
	public String toString() {
		return "사과는 맛있다.";
	}

	public void showInfo() {
		System.out.println("나는 사과입니다.");
	}
}

class Banana {
	@Override
	public String toString() {
		return "바나나는 멸종 위기이다";
	}
}

class InstanceType {
	private int count;

//	public void showInstanceType(Apple apple) {
//		System.out.println("type >> "+apple);
//		count++;
//	}

//	public void showInstanceType(Object object) {
//		System.out.println("type >> "+object);
//		count++;
//	}

	// 제네릭 함수=====================================
	public <T> void showInstanceType(T type) {
		System.out.println("type >> " + type);
		count++;
	}

	public void showCount() {
		System.out.println("count >> " + this.count);
	}
}

public class GenericEx02 {
	public static void main(String[] args) {
		Apple apple = new Apple();
		Banana banana = new Banana();

		InstanceType in = new InstanceType();
		in.<Apple>showInstanceType(apple);
		in.showCount();

		in.<Banana>showInstanceType(banana);
		in.showCount();

		in.<String>showInstanceType("안녕");
		in.showCount();
	}
}
