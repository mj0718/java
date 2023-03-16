package lambda;

// [함수형 인터페이스] 
// - 추상 메서드가 1개 정의되어 있고, 람다식을 다루기 위한 인터페이스
// - 추상 메서드는 반드시 1개만 정의 -> 람다식과 인터페이스가 1:1 대응(연결)

@FunctionalInterface
interface Box {
	public String boxing();
}

class Banana {
	public Banana() {
		System.out.println("\n[Banana constructor] 나는 바나나다. ");
	}

	public void buy(Box box) {
		System.out.println(box.boxing());
	}

	// [익명 클래스]
//	public Box change() {
//		return new Box() {
//			@Override
//			public String boxing() {
//				return "새 바나나 박스로 교환합니다";
//			}
//		};
//	}
	// [lambda]
	public Box change() {
		return () -> "새 바나나 박스로 교환합니다";
	}
}

public class LambdaEx02 {
	public static void main(String[] args) {

		// 익명 클래스
		// 1. 객체 생성
		Banana bananaOne = new Banana();

		// 2-1. 익명 클래스를 참조변수에 저장
		Box box = new Box() {
			@Override
			public String boxing() {
				return "[익명 클래스] 바나나를 박스에 담아요.";
			}
		};
		bananaOne.buy(box);
		System.out.println(bananaOne.change().boxing());

		// 2-2. 익명 클래스를 인수에 사용
		bananaOne.buy(new Box() {
			@Override
			public String boxing() {
				return "[익명 클래스] 바나나를 포장합니다.";
			}
		});

		// [Lambda]
		// 1. 객체 생성
		Banana lambda = new Banana();

		// 2-1. 람다식을 참조변수에 저장
		Box lambdaBox = () -> "[lambda] 바나나를 박스에 담아요.";
		lambda.buy(lambdaBox);

		// 2-2. 람다식을 인수에 사용
		lambda.buy(() -> "[lambda] 바나나를 포장합니다.");
	}
}
