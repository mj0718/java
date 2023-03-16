class Animal {
	private int age;
	private String name;
	
	public Animal() {}
	public Animal(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	public void showInfo() {
		System.out.println("동물입니다.");
	}
}
class Cat extends Animal {
	
	public Cat(int age, String name) {
		super(age,name);
	}
	public void showInfo() {
		System.out.println("나이: "+super.getAge()+", 이름: "+super.getName());
	}
}
class Dog extends Animal {

	public Dog(int age, String name) {
		super(age, name);
	}
	public void showInfo() {
		System.out.println("나는 강아지입니다.");
		System.out.println("나이는 "+super.getAge() +", 이름은 "+super.getName());
	}
	
}
public class PolymorphismEx02 {
	public static void main(String[] args) {
		
//		Cat mimi = new Cat(5,"미미");
//		Dog hoya = new Dog(3,"호야");
//		mimi.showInfo();
//		hoya.showInfo();
		
		Animal[] animal = {new Cat(5,"미미"), new Dog(3,"호야")};
		animal[0].showInfo();
		animal[1].showInfo();
	}
}
