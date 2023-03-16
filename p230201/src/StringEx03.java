class Student {

}

public class StringEx03 {
	public static void main(String[] args) {

		Student s = new Student();
		System.out.println(s);
		System.out.println(s.toString()); // 위 코드랑 똑같은 것임
		System.out.println(s.getClass());
		System.out.println(s.getClass().getName()); // 클래스명만 출력

		String str = "안녕";
		System.out.println(str);
		System.out.println(str.toString()); // 위 코드랑 똑같은 것임

	}
}
