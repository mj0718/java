package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getAge() {
		return age;
	}

	public final void setAge(int age) {
		this.age = age;
	}
}

public class OptionalQuiz {
	public static Optional<Person> findByName(String name) {
		List<Person> result = Arrays.asList(new Person("홍길동", 29), new Person("박보검", 35), new Person("이미자", 52));

		// Optional class 사용 =======================================================
		// 매개변수 name이 result에 저장되어 있으면 객체의 주소 리턴
		// result에 저장되어 있지 않으면 null 리턴
		// ===========================================================================
//		for (Person p : result) {
//			if (p.getName().equals(name))
//				return Optional.of(p);
//		}
//		return Optional.empty();

		// [문제] 위 코드를 stream으로 변경
		return result.stream().filter(s -> s.getName().equals(name)).findAny();
	}

	public static void main(String[] args) {
		System.out.println("박보검 찾아라! >> " + findByName("박보검")); 
		System.out.println("박보검 찾아라! >> " + findByName("박보검").get()); //주소만 뽑아옴
		System.out.println("박보검 찾아라! >> " + findByName("박보검").get().getName()); // 이름 출력
		System.out.println("하늘 찾아라! >> " + findByName("하늘"));
	}
}
