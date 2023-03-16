package method.reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Person {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}

	public void returnName(Person person) {
		System.out.println(person.getName());
	}
}

public class MethodReferenceQuiz {
	public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T t : list)
			consumer.accept(t);
	}

	public static void main(String[] args) {
		List<Person> person = new ArrayList<Person>();
		person.add(new Person("홍길동", 29));
		person.add(new Person("박보검", 35));
		person.add(new Person("이미자", 52));

		System.out.println("<< 향상된 for문 >>");
		for (Person p : person)
			System.out.println(p);

		// [문제 1] 정의한 forEach문 사용 =================================
		// [문제 1-1] 이름과 나이 출력 : toString()
		// [람다]
		System.out.println("\n<< 정의한 forEach문 - 이름, 나이 출력 [람다] >>");
		forEach(person, p -> System.out.println(p.toString()));
		// [메서드 참조]
		System.out.println("\n<< 정의한 forEach문 - 이름, 나이 출력 [메서드 참조] >>");
		forEach(person, System.out::println);

		// [문제 1-2] 이름만 출력 : getName()
		// [익명 클래스]
		System.out.println("\n<< 정의한 forEach문 - 이름 출력 [익명 클래스] >>");
//		forEach(person, new Consumer<Person>() {
//			@Override
//			public void accept(Person p) {
//				System.out.println(p.getName());
//			}
//		});
		forEach(person, new Consumer<Person>() {
			@Override
			public void accept(Person p) {
				p.returnName(p);
			}
		});
		// [람다]
		System.out.println("\n<< 정의한 forEach문 - 이름 출력 [람다] >>");
		// forEach(person, p -> System.out.println(p.getName()));
		forEach(person, p -> p.returnName(p));
		// [메서드 참조]
		System.out.println("\n<< 정의한 forEach문 - 이름 출력 [메서드 참조] >>");
		forEach(person, new Person()::returnName);

		// [문제 2] ArrayList의 forEach문 사용 ============================
		// [문제 2-1] 이름과 나이 출력 : toString()
		// [람다]
		System.out.println("\n<< ArrayList의 forEach문 - 이름, 나이 출력 [람다] >>");
		person.forEach(p -> System.out.println(p.toString()));
		// [메서드 참조]
		System.out.println("\n<< ArrayList의 forEach문 - 이름, 나이 출력 [메서드 참조] >>");
		person.forEach(System.out::println);
		// [문제 2-2] 이름만 출력 : getName()
		// [람다]
		System.out.println("\n<< ArrayList의 forEach문 - 이름 출력 [람다] >>");
		person.forEach(p -> System.out.println(p.getName()));
		// [메서드 참조]
		System.out.println("\n<< ArrayList의 forEach문 - 이름 출력 [메서드 참조] >>");
		person.forEach(new Person()::returnName);

	}
}
