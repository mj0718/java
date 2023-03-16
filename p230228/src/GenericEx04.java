interface Available {
	void selfIntroduction();
}

class Tree {
	private String sort;
	private int age;

	public Tree() {}
	public Tree(String sort, int age) {
		this.sort = sort;
		this.age = age;
	}

	public void info() {
		System.out.printf("[INFO] 종류: %s, 나이: %d\n\n", sort, age);
	}
}

class Maple extends Tree implements Available {
	public Maple(String sort, int age) {
		super(sort, age);
	}

	@Override
	public void selfIntroduction() {
		System.out.println("나는 단풍나무이다.");
	}
}

class Pine extends Tree implements Available {
	public Pine(String sort, int age) {
		super(sort, age);
	}

	@Override
	public void selfIntroduction() {
		System.out.println("나는 소나무이다.");
	}

}

public class GenericEx04 {
	// [제네릭 메서드]
	// 제네릭 매개변수는 Object method만 호출 가능 => 강제 형변환 => 안전하지 않음
	// 강제 형변환이 Available로 설정됨에 따라, 실행시 Error 발생 가능성 있음
	// 제네릭 장점이 사라짐
	// 따라서 자바는 제네릭 매개변수 자료형에 제한을 두는 문법 제공 => 자료형에 안전한 구조
	// [자료형에 안전하지 않은 코드]
//	public static <T> void callSelfIntroduction(T t) {
//		((Available) t).selfIntroduction();  강제 형변환
//	}

	// [자료형에 안전한 코드]
	// 제네릭 타입 제한에 사용된 extends => class와 interface 구분없이 extends 사용
	// <T extends Available> : Available를 포함한 자식 타입
	public static <T extends Available> void callSelfIntroduction(T t) {
		t.selfIntroduction();
	}

	// [자료형에 안전하지 않은 코드]
//	public static <T> void callInfo(T t) {
//		((Tree) t).info();
//	}
	// [자료형에 안전한 코드]
	public static <T extends Tree> void callInfo(T t) {
		t.info();
	}

	public static void main(String[] args) {
		Maple maple = new Maple("당단풍나무", 25);
		Pine pine = new Pine("금강고로쇠", 35);

		callSelfIntroduction(maple);
		callSelfIntroduction(pine);

		// callSelfIntroduction("안녕"); Error : Available의 자식이 아니므로

		callInfo(maple);
		callInfo(pine);
		// callInfo("안녕"); Error
	}
}
