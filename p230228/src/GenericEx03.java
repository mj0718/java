/*
 * [제네릭 클래스]
 */
class Fruit<T> {
	private T type;

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}

}

public class GenericEx03 {
	public static void main(String[] args) {
		Fruit<Integer> fruit = new Fruit<Integer>();
		fruit.setType(5);
		System.out.println("과일 개수 >> " + fruit.getType());

		Fruit<String> apple = new Fruit<String>();
		apple.setType("사과");
		System.out.println("현재 과일은 >> " + apple.getType());
	}
}
