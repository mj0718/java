package enumex;

// 참조형: class, interface, enum

enum SeasonTwo {
	
	// 2. field : public static final 안 써도 됨 /  맨 첫 줄에 와야함 / 필드만 오면 뒤에 세미콜론 생략 가능
	SPRING, SUMMER, FALL, WINTER;
	
	// 생성자 : private으로 고정
	//SeasonTwo() {}
}

public class EnumEx03 {
	public static void main(String[] args) {
		
		// 1. enum의 객체 생성 불가능 => 생성자가 private이므로
		//SeasonTwo s = new SeasonTwo();
		
		// 2-2. 출력
		System.out.println(SeasonTwo.SPRING);
		System.out.println(SeasonTwo.SUMMER);
		System.out.println(SeasonTwo.FALL);
		System.out.println(SeasonTwo.WINTER);
		
		// 2-3. 열거형 상수를 배열 형태로 리턴
		System.out.println(SeasonTwo.values());
		
		// 2-4. 열거형 상수의 값 확인: ordinal() => 서수(순서)
		for(SeasonTwo s : SeasonTwo.values())
			System.out.println(s.ordinal());
		
		// 3-1. 열거형 변수
		SeasonTwo spring = SeasonTwo.SPRING;
		System.out.println("spring >> "+spring);
		
		SeasonTwo spring_two = SeasonTwo.SPRING;
		if(spring==spring_two)
			System.out.println("같다");
		else
			System.out.println("다르다");
		
		// 4. 열거형의 상수명 리턴 (field에 저장된 값)
		System.out.println("상수명 >> "+SeasonTwo.SPRING.name());
	}
}
