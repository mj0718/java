package enumex;

enum Shoes {
	//enum constant
	WALKING("워킹화"), RUNNING("러닝화"), TRACKING("트레킹화"), HIKING("하이킹화");
	
	//field
	private String name;
	
	//constructor
	Shoes(String name) {
		this.name=name;
	}
	//getter method
	public String getName() {
		return this.name;
	}
}

public class EnumQuiz {
	public static void main(String[] args) {
		System.out.println("<< 상수 출력 >>");
		System.out.println(Shoes.WALKING); //WALKING
		System.out.println(Shoes.RUNNING); //RUNNING
		System.out.println(Shoes.TRACKING); //TRACKING
		System.out.println(Shoes.HIKING); //HIKING
		
		System.out.println("\n<< 상수값 출력 >>");
		for(Shoes s : Shoes.values())
			System.out.println(s.getName()); //워킹화 러닝화 트레킹화 하이킹화
	}
}
