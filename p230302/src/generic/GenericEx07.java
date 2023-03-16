package generic;

// [제네릭 클래스의 상속]
// 자식에 설정된 제네릭 타입(자료형 정보)은 부모도 같은 타입으로 설정됨
// 즉, 하나의 자료형 정보로 Parent와 Child 자료형이 모두 결정됨

// 제네릭 클래스
class Parent<T> {
	T item;

	public Parent() {}

	public Parent(T item) {
		this.item = item;
	}
	public void showItem() {
		System.out.println("item >> "+item);
	}
}

class Child<T> extends Parent<T> {
	
	public Child() {}

	public Child(T item) {
		super(item);
	}

	public void showType(T t) {
		System.out.println("Type t >> " + t);
	}
	public <E> void test(E e) {
		System.out.println(e);
	}
}

public class GenericEx07 {
	public static void main(String[] args) {
		Child<String> child = new Child<String>();
		child.showType("홍길동");
		
		Child<String> childTwo = new Child<String>("나는 자식이다.");
		childTwo.showItem();
	}
}
