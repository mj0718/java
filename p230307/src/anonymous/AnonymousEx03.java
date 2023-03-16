package anonymous;

@FunctionalInterface
interface Box {
	// 추상 메서드
	public void boxing();
}

class Banana {
	public Banana() {
		System.out.println("[Banana] 바나나는 멸종위기입니다.");
	}
	public void buy(Box box) {
		box.boxing();
	}
}

public class AnonymousEx03 {
	public static void main(String[] args) {
		// 1. 객체 생성
		Banana banana = new Banana();
		// 2. 익명 클래스: 인수
		banana.buy(new Box() {
			@Override
			public void boxing() {
				System.out.println("바나나를 포장합니다.");
			}
		});
		
		// 3. [문제] 위 2를 람다식으로 표현
		banana.buy(() ->System.out.println("[람다] 바나나를 포장합니다."));
	}
}
