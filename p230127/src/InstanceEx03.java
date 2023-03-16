class Dog {
	int age;
	String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class InstanceEx03 {

	public static void main(String[] args) {

		// 객체 생성
		Dog happy = new Dog();
		Dog sky = new Dog();

		// 객체에 이름 저장
		happy.setName("해피");
		sky.setName("하늘");

		// 객체에 저장된 이름 출력
		System.out.println("첫 번째 객체: " + happy.getName());
		System.out.println("두 번째 객체: " + sky.getName());
	}

}
