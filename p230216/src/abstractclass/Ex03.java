package abstractclass;

/*
 * Cat, Dog class 에러 해결
 * class 내 animalPlay() 메서드 정의
 * play() 메서드 호출
 * animalPlay(roy); => 로이는 터그 놀이 중입니다.
 * animalPlay(bear); => 베어는 낚싯대 놀이 중입니다.
 */
abstract class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	// 추상 메서드
	public abstract void play();

}

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println(super.name + "는 터그 놀이 중입니다.");
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println(super.name + "는 낚싯대 놀이 중입니다.");
	}
}

public class Ex03 {
	public static void animalPlay(Animal animal) {
		animal.play();
	}
	public static void main(String[] args) {
		Dog roy = new Dog("로이");
		Cat bear = new Cat("베어");

		animalPlay(roy);
		animalPlay(bear);
	}
}