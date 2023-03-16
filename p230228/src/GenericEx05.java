// 1. 제네릭 타입은 해당 {}내에서만 유효
// 제네릭 타입 선언 형태: 
// 1-1. 인터페이스
// 1-2. 클래스
// 1-3. 메서드
// 1-1. [제네릭 인터페이스]
interface InterfaceName<T> {}
// 1-2.[제네릭 클래스]
class ClassName<T> {}

// 2. 제네릭 타입(타입 파라미터)은 두 개 이상 가능
class ClassOne<K,V> {}

// 클래스 상속
class ClassSuper {}
class ClassSub extends ClassSuper {}

public class GenericEx05 {
	// 1-3. [제네릭 메서드]
	public static <T> void show(T t) {
		System.out.println(t);
	}
	
	// [extends와 super] 
	// [타입 중점]
	// <T extends 타입> : 가능
	// <T super 타입> : 불가능
	// 타입 파라미터를 제한 =========================================
	public <T extends ClassSuper> void one(T t) {}
	//public <T super ClassSub> void two(T t) {} 문법 불가능
	
	// [기능(동작) 중점] 타입보다는 기능 그 자체에 초점을 둔 메서드
	// 제네릭 인터페이스 또는 제네릭 클래스를 파라미터로 사용
	// ?: 와일드카드
	// <? extends 타입>: 가능
	// <? super 타입>: 가능
	public void three(ClassName<?> name) {}
	// 제네릭 타입(타입 파라미터)을 타입 제한(한정) =================
	public void four(ClassName<? extends ClassSuper> name) {}
	public void five(ClassName <? super ClassSub> name) {
		name.toString();
	}
	
	public <T extends ClassName<?>> void six(T t) {}
	
	public static void main(String[] args) {
		show(new Integer(5)); // 참조형
		show(5); // 자동 형변환: Wrapper class
		//show(int); Error : 기본형은 처리해주지 않음
	}
}