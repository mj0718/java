package stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx05 {
	public static void main(String[] args) {
		List<Student> student = Arrays.asList(new Student("홍길동", 29), new Student("박보검", 35), new Student("이미자", 52));
		
		System.out.println("1. findAny()");
		student.stream().findAny().ifPresent(s -> System.out.println(s.getName()));
		
		System.out.println("2. findFirst()");
		student.stream().findFirst().ifPresent(s -> System.out.println(s.getName()));
		
		// 요소 모두 삭제
		student.clear();
		
		System.out.println("3. 모든 요소 삭제 후 : findAny()");
		student.stream().findAny().ifPresent(s -> System.out.println(s.getName()));
	}
}
