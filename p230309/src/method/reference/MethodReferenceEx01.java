/*
 * [메서드 참조] Method Reference 
 * 이중 콜론 연산자 ::
 * 함수형 인터페이스를 람다식이 아닌 일반 메서드를 '참조'하여 선언하는 방법
 * 
 * - functional interface(Single Abstract Method: SAM)는 반드시 abstract method가 1개
 * - @FunctionalInterface 어노테이션으로 보장
 * 
 * - 리턴 타입과 파라미터 타입이 동일한 '기존에 구현된' 메서드를 빈 껍데기만 참조하면 더 간편하게 사용할 수 있음
 * 
 * - '기존에 구현된' 메서드와 abstract method의 선언부가 완전히 같아야함
 * - 단, 메서드명은 달라도 됨
 * - 매개변수 정보(타입과 개수)와 리턴 타입은 동일하고 기능만 다르다는 것이 핵심
 * - 따라서, abstract method를 완전히 하나의 메서드로 호출 가능
 * 
 * - 참조: 주소 의미 -> 가리킨다
 * - 참조만 하기에, 메서드명만 사용하고 파라미터의 () 제외
 * - 즉, 주소만 사용함
 * ** 이미 정의된 다른 메서드의 body만 가져다 사용하는 형태
 * 
 * - anonymous class -> lambda expression -> method reference
 * 
 * - 람다식으로 표현 가능한 것만 메서드 참조로 표현 가능
 * - 람다식에서 파라미터 제거
 * 
 * - 참조 가능한 메서드: instance method, static method, constructor
 * 
 * - [문법] 
 * 1) 참조변수::instance 메서드명
 * 		String::메서드명
 * 2) 클래스명::static 메서드명
 * 3) 클래스명::new  -> 생성자
 */
package method.reference;

@FunctionalInterface
interface Fruit {
	String selfIntroduction(String s1, String s2);
}

// abstract method 사용하려면 ==================
// 1. class 구현 -> 객체 생성 -> 메서드 호출
// 2. anonymous class
// 3. lambda expression
// 4. method reference expression
// =============================================

// 1-1. class 구현
class Banana implements Fruit {
	@Override
	public String selfIntroduction(String s1, String s2) {
		return s1 + s2;
	}
}

class Add {
	public Add() {
		System.out.println("[Add class] 생성자 실행됨");
	}

	String instanceAdd(String s1, String s2) {
		return "[이미 정의된 instance 메서드] ".concat(s1).concat(", ").concat(s2);
	}

	static String staticAdd(String s1, String s2) {
		return "[이미 정의된 static 메서드] " + s1 + "-" + s2;
	}
}

public class MethodReferenceEx01 {
	public static void main(String[] args) {

		// 1-2. 객체 생성
		Banana banana = new Banana();
		System.out.println(banana.selfIntroduction("안녕", "저는 바나나입니다."));

		// 2. anonymous class
		Fruit anonymous = new Fruit() {
			@Override
			public String selfIntroduction(String s1, String s2) {
				return "[익명 클래스] " + s1.concat(s2);
			}
		};

		System.out.println(anonymous.selfIntroduction("안녕", "저는 바나나입니다."));

		// 3. lambda expression
		Fruit lambda = (s1, s2) -> "[람다] " + s1.concat(s2);
		System.out.println(lambda.selfIntroduction("안녕", "저는 바나나입니다."));

		// 4. method reference
		// 4-1. instance method
		// [방법 1]
		// =====================================================================================
		// a) anonymous class
		Fruit anonymousInstance = new Fruit() {
			@Override
			public String selfIntroduction(String s1, String s2) {
				Add add = new Add();
				return add.instanceAdd(s1, s2);
			}
		};
		System.out.println(anonymousInstance.selfIntroduction("<<익명 클래스>> 첫 번째", "두 번째"));

		// b) lambda expression
		Fruit lambdaInstance = (String s1, String s2) -> {
			Add add = new Add();
			return add.instanceAdd(s1, s2);
		};
		System.out.println(lambdaInstance.selfIntroduction("<<람다>> 첫 번째", "두 번째"));

		// c) method reference
		Add add = new Add();
		Fruit reference = add::instanceAdd;
		System.out.println(reference.selfIntroduction("안녕", "저는 바나나입니다"));

		// [방법 2]
		// a) anonymous class
		Fruit anonymousInstanceTwo = new Fruit() {
			@Override
			public String selfIntroduction(String s1, String s2) {
				return new Add().instanceAdd(s1, s2);
			}
		};
		System.out.println(anonymousInstanceTwo.selfIntroduction("<<익명 클래스 2>> 첫 번째", "두 번째"));

		// b) lambda expression
		Fruit lambdaInstanceTwo = (String s1, String s2) -> new Add().instanceAdd(s1, s2);
		System.out.println(lambdaInstanceTwo.selfIntroduction("<<람다 2>> 첫 번째", "두 번째"));

		// c) method reference
		Fruit referenceInstanceTwo = new Add()::instanceAdd;
		System.out.println(referenceInstanceTwo.selfIntroduction("<<메서드 참조 2>> 첫 번째", "두 번째"));

		// 4-2. static method
		// a) anonymous class
		Fruit anonymousStatic = new Fruit() {
			@Override
			public String selfIntroduction(String s1, String s2) {
				return Add.staticAdd(s1, s2);
			}
		};
		System.out.println(anonymousStatic.selfIntroduction("<<익명 클래스>> One", "Two"));

		// b) lambda expression
		Fruit lambdaStatic = (String s1, String s2) -> Add.staticAdd(s1, s2);
		System.out.println(lambdaStatic.selfIntroduction("<<람다>> One", "Two"));

		// c) method reference
		Fruit referenceStatic = Add::staticAdd;
		System.out.println(referenceStatic.selfIntroduction("안녕", "저는 바나나입니다"));

		// 4-3. constructor
		Runnable constructor = Add::new;
		constructor.run();
	}
}
