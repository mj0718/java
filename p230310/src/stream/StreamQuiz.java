package stream;

import java.util.Arrays;
import java.util.List;

class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			return name.equals(s.name) && (age == s.age);
		}
		return false;
	}
}

public class StreamQuiz {
	public static void main(String[] args) {
		// Student 1차원 배열
		Student[] student = { new Student("홍길동", 29), 
				new Student("박보검", 35),
				new Student("이미자", 52),
				new Student("박보검", 35)
		};
		
		// Student 1차원 배열 -> List 반환
		List<Student> list = Arrays.asList(student);
		
		// [Stream] 중복 요소를 제거한 후, 출력
		list.stream()
			.distinct()
			.forEach(System.out::println);
	}
}
