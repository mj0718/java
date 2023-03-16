package collection;

import java.util.HashMap;
import java.util.Map;

class Person {
	private String name;
	private int age;

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
}

public class HashMapEx02 {
	public static void main(String[] args) {
		Person hong = new Person("홍길동",25);
		Person park = new Person("박보검",35);
		
		// [유형 1]
		Map<String, Object> p = new HashMap<String, Object>();
		p.put("name", hong.getName());
		p.put("age", hong.getAge());
		System.out.println(p);
		
		// [유형 2]
		Map<Integer, Person> member = new HashMap<>();
		member.put(1, hong);
		member.put(2, park);
		System.out.println(member);
	}
}
