// 클래스 정의
class Person {
	// 멤버 변수
	int age;
	String name;
	String address;

	// 멤버 메소드
	// setter
	void setAge(int age) {
		this.age = age;
	}

	int getAge() {
		return age;
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}

public class InstanceEx02 {
	public static void main(String[] args) {

		// 1. 참조 변수 선언
		// [문법] 자료형(class명) 변수명(참조변수);
		Person p1;

		// 2. 객체 생성
		// [문법] new 클래스명();
		// new: heap 영역에 할당하세요라는 의미
		p1 = new Person();

		// 3. 멤버 접근
		// 3-1. 멤버 변수 값 설정
		// 참조 변수를 통한 멤버 변수 값 설정: 외부 접근 => 객체지향에서는 권장하지 않음
		// p1.age = 27;
		p1.setAge(100);
		p1.setName("홍길동");

		System.out.println("나이 >> " + p1.getAge());
		System.out.println("이름 >> " + p1.getName());
	}
}
