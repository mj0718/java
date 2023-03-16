class Student {
	// 멤버 변수 (field)
	int age;
	String name;

	// 생성자
	Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	// 멤버 메소드
	void showInfo() {
		System.out.println("나이 : " + this.age);
		System.out.println("이름 : " + this.name + "\n");
	}
}

public class ArrayInstanceEx01 {
	public static void main(String[] args) {

		// [객체 배열] : 1차원 배열
		// 타입[] 배열명 = new 타입[길이];
		// 배열 생성과 동시에 초기화
		Student[] smart = { new Student(20, "hong"), new Student(29, "park"), new Student(35, "choi") };

		// 일반 for문 : 내장변수 length
		for (int i = 0; i < smart.length; i++) {
			smart[i].showInfo();
		}

		// 향상된 for문
		// 자료형은 배열에 저장된 주소가 가리키는 배열의 타입이 와야함
		for (Student student : smart) {
			student.showInfo();
		}
	}
}
