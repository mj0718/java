import java.util.HashSet;

class Person {
	private String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return (this.name + this.age).hashCode(); // 해시코드 만들어 정수로 리턴
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person person = (Person) obj;
			return name.equals(person.name) && (age == person.age);
		} else {
			return false;
		}
	}
}

public class HashSetQuiz {
	public static void main(String[] args) {

		Person hong = new Person("홍길동", 25);
		Person park = new Person("박보검", 35);

		HashSet<Person> hashSet = new HashSet<Person>();

		hashSet.add(hong);
		hashSet.add(park);
		hashSet.add(new Person("이미자", 52));

		System.out.println("<< 전체 요소 출력 >>");
		for (Person p : hashSet)
			System.out.println(p.getName());

		System.out.println("\n<< 새 요소 추가 : 박보검, 35 >>");
		hashSet.add(new Person("박보검", 35));

		System.out.println("<< 새 요소 추가 후 >>");
		for (Person p : hashSet)
			System.out.println(p.getName());

		System.out.println("<< hashcode 확인 >>");
		for (Person p : hashSet)
			System.out.printf("이름 : %s, 해시코드 : %d\n", p.getName(), p.hashCode());

		System.out.println("하나".hashCode());
		System.out.println("하나".hashCode());
		System.out.println(Integer.hashCode(25));

		System.out.println("박보검".hashCode());
		System.out.println("박보검".hashCode() + 35);

		System.out.println(("박보검" + 35).hashCode());

	}
}