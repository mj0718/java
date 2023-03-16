class Parent {
	private int money = 1000000;

	public void spend(int money) {
		this.money -= money;
		System.out.println("남은 돈은 " + this.money + "입니다.");
	}

	public void working() {
		System.out.println("부모님은 열심히 일하는 중입니다.");
	}
}

class Son extends Parent {
	public void play() {
		System.out.println("노는 중~");
	}

	@Override
	public void spend(int money) {
		System.out.println("<< 오버라이딩된 메서드 >>");
		System.out.println("용돈 " + money + "원 주세요");
		System.out.println("==========================");
	}
}

class Daughter extends Parent {
	public void study() {
		System.out.println("공부 중~");
	}

	@Override
	public void spend(int money) {
		System.out.println("[오버라이딩된 메서드]");
		System.out.println("학원비 " + money + "원 주세요");
		System.out.println("---------------------------");
	}
}

public class PolymorphismEx01 {

	public static void main(String[] args) {

		Parent p = new Parent();

		// 다형성
		Parent p2 = new Son();
		p2.spend(100);
		Parent p3 = new Daughter();
		p3.spend(200);
		//Daughter d = new Parent(); 다형성 아님
		
		// 객체 배열
		// 첫 번째 형태: 객체 배열 생성 후 초기화
		Parent[] p4 = new Parent[2];
		p4[0] = new Son();
		p4[1] = new Daughter();
		
		p4[0].spend(11);
		p4[1].spend(22);
		
		// 두 번째 형태: 객체 배열 생성과 동시에 초기화
		Parent[] p5 = {new Son(), new Daughter()}; 
		
		// 형변환: 부모 자식 관계일 때만 가능
		// 1. 다형성
		Parent pr = new Son();
		
		// 2. 참조형의 형변환
		Son so = (Son)pr; // 강제형변환(downcasting)
		
		Son sn = new Son();
		Parent pt = sn; // 자동형변환(upcasting)
		
		// 3. 형변환 가능 여부
		// [문법] 참조변수 또는 객체 instanceof 클래스
		System.out.println(pr instanceof Son);
		System.out.println(pr instanceof Parent);
		System.out.println(p instanceof Parent);
		System.out.println(p instanceof Son);
		
		Daughter d = new Daughter();
		Son s = new Son();
		System.out.println(s instanceof Son);
	// System.out.println(s instanceof Daughter);  부모 자식관계가 아니므로 Error
		
//		Son s = new Son();
//		s.spend(100000);
	}
}
