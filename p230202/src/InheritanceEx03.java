class Student {
	// method overriding
	public String toString() {
		// System.out.println("<< 재정의된 메소드 toString 실행됨 >>");
		return "Student Class";
	}
}

public class InheritanceEx03 {
	public static void main(String[] args) {

		Student s = new Student();
		System.out.println(s);
		System.out.println(s.toString());
	}
}
