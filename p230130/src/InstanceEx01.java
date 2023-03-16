class Student {
	// 멤버 변수
	int age;
	String name;

	// 멤버 메소드
	void Study() {
		System.out.println("공부해요.");
	}

	void showInfo() {
		System.out.println("나이 >> " + age + ", 이름 >> " + name);
	}
}

public class InstanceEx01 {
	public static void main(String[] args) {

		// 참조변수 선언
		// [문법] 클래스명 변수명;
		Student hong;

		// 객체 생성: 메모리 할당 => heap 영역에 할당
		// [문법] new 클래스명()
		// 생성된 객체는 객체의 주소를 알면 접근 가능
		hong = new Student();

		// 멤버 접근
		// [문법] 참조변수.멤버변수/멤버메소드 => 객체지향은 외부접근을 통한 멤버변수 접근: 권장X
		// System.out.println("멤버 변수 age: 초기값 >> " + hong.age);
		// System.out.println("멤버 변수 name: 초기값 >> " + hong.name);
		hong.showInfo();

	}
}
