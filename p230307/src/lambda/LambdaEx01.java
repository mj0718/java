/*
 * [람다 표현식] 람다식, 람다, lambda expression
 * - Java 8부터 함수형 프로그래밍 지원을 위해 Lambda, Stream 도입
 * - 메서드를 하나의 식으로 표현
 * - lambda는 익명 함수(anonymous function)를 의미 -> 메서드명 없음
 * - 사실상 객체로 관리
 * 
 * << 특징 >>
 * - 메서드명과 반환형 생략, return 키워드 대신 식(expression) 사용
 * - 람다식 내 지역 변수 final
 * 
 * << 장점 >>
 * - 코드 간결
 * - 가독성 높아짐
 * - 메서드 정의 없이 한번에 처리 가능하므로 생산성 높아짐
 * 
 * << 단점 >> 
 * - 익명 함수이므로 재사용 불가능
 * - 디버깅 어려움
 * - 재귀로 부적함
 * 
 * << 문법 >>
 * - [형태 1] 
 * 	() -> expression 
 * - [형태 2]
 * 	(parameter) -> expression
 * - [형태 3]
 * 	(parameter1, parameter2) -> {
 * 		code;
 * 		code;
 * 		return 값;
 * 	}
 * 
 * () : parameter - 메서드의 매개변수
 * -> : arrow - {} 실행
 * {} : body - 메서드의 바디 (생략가능)
 * 
 * << 활용 >>
 * 1. 참조변수에 람다식 저장
 * 2. return
 * 3. 인수
 */

package lambda;

@FunctionalInterface //함수형 인터페이스
interface Mood {
	String howAreYouFeeling(String feel);
}

class Person implements Mood {
	@Override
	public String howAreYouFeeling(String feel) {
		return "오늘은 기분은? --> " + feel;
	}
}

public class LambdaEx01 {
	public static void main(String[] args) {

		// 객체 생성
		Mood instance = new Person();

		String s = instance.howAreYouFeeling("똑같아");
		System.out.println(s);

		// << 익명 클래스 >>
		// [형태 1] 참조변수 저장 -> 참조변수를 통한 메서드 호출
		Mood moodOne = new Mood() {

			@Override
			public String howAreYouFeeling(String feel) {
				return "[익명 클래스] 저는요 >>> " + feel;
			}
		};

		String one = moodOne.howAreYouFeeling("좋아요");
		System.out.println(one);

		// [형태 2] 위 코드를 더 간결하게
		// 객체 생성 후 메서드 호출
		System.out.println(new Mood() {
			@Override
			public String howAreYouFeeling(String feel) {
				return "[익명 클래스] 더 간결해짐! 기분은? " + feel;
			}
		}.howAreYouFeeling("신기하다"));

		// << 람다식 >>
		// [형태 1-1] 
		// 생략: method명, 반환형 
		// 명시: 매개변수 타입, 매개변수명
		Mood moodTwo = (String feel) -> "[Lambda 1] 제 기분은 >>> " + feel;
		
		String two = moodTwo.howAreYouFeeling("신난다");
		System.out.println(two);
		
		// [형태 1-2] 
		// 생략: method명, 반환형, 매개변수 타입
		// 명시: 매개변수명
		Mood moodThree = (feel) -> "[Lambda 2] 현재 기분은 >>> " + feel;

		String three = moodThree.howAreYouFeeling("최고입니다");
		System.out.println(three);
		
		// [문제] 익명 클래스 [형태 2]를 lambda식으로 수정(변경) 
		// [형태 2] 람다식을 인수에 사용 (불가능)
		//System.out.println(((Mood)(feel) -> "[익명 클래스] 더 간결해짐! 기분은? " + feel).howAreYouFeeling("신기하다"));
	}
}