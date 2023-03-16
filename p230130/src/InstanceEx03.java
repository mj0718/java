public class InstanceEx03 {

	// 메소드 정의
	public static void newYear(Student student) {
		System.out.println("참조변수 student에 저장된 객체 주소: " + student);
		System.out.println("이름 >> " + student.name);
		System.out.println("나이 >> " + student.age++);
	}

	public static void main(String[] args) {

		Student hong = new Student();
		System.out.println("참조변수 hong에 저장된 객체 주소: " + hong); //hong과 student의 주소는 같음
		hong.name = "홍길동";
		hong.age = 25;
		hong.showInfo();

		newYear(hong);
		hong.showInfo();
		
		newYear(new Student()); //이렇게도 많이 사용함
	}
}
