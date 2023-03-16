class Dog {
	int age;
	String name;

	Dog() {
		System.out.println("<< 매개변수가 없는 생성자 실행 완료 >>");
		this.showInfo();
	}

	Dog(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("<< 매개변수가 2개인 생성자 실행 완료 >>");
		this.showInfo();
	}

	void showInfo() {
		System.out.println("나이 : " + age + ", 이름 : " + name);
	}
}

public class ConstructorEx03 {
	public static void main(String[] args) {

		Dog happy = new Dog();
		//happy.showInfo();

		Dog sky = new Dog(5, "하늘");
		//sky.showInfo();
	}
}
