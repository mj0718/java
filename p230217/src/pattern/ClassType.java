package pattern;

class Dog {
	// field 
	int age = 5;
	
	// method
	public void showAge() {
		System.out.println("나이 >> "+age);
	}
	
	public void createInstance() {
		Dog dog = new Dog();
		dog.showAge();
	}
}

public class ClassType {
	int num;
	
	public static void main(String[] args) {
		ClassType type = new ClassType();
		System.out.println(type.num);
	}
}
