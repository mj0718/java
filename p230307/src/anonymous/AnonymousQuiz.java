package anonymous;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.printf("이름 : %s, 나이 : %d\n", name, age);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class AnonymousQuiz {
	public static void main(String[] args) {

		HashSet<Person> hashSet = new HashSet<Person>();
		hashSet.add(new Person("홍길동", 29));
		hashSet.add(new Person("박보검", 35));
		hashSet.add(new Person("이미자", 52));

		// 출력: 저장된 순서 확인
		Iterator<Person> iter = hashSet.iterator();
		while (iter.hasNext())
			iter.next().showInfo();

		// [문제] 이름 기준으로 오름차순 정렬
		// 1-1. Comparator 인터페이스 구현
		Comparator<Person> comparator = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		// [문제] 위 1-1을 람다식으로 변환
		Comparator<Person> lambda = (o1, o2) -> o1.getName().compareTo(o2.getName());
		
		// 1-2. ArrayList 형변환
		ArrayList<Person> list = new ArrayList<Person>(hashSet);
		
		// 1-3. 오름차순 정렬
		//list.sort(comparator);
		list.sort(lambda);
		
		// 1-4. 출력
		System.out.println("\n<< 오름차순 정렬 후 >>");
		for(Person p : list)
			p.showInfo();
	}
}
