import java.util.function.Function;

public class FunctionalInterfaceEx03 {
	public static void main(String[] args) {
		// Function<T, R> : 매개변수 T 1개, 반환값 R
		// Function<매개변수 타입, 반환형>

		// 1. 정수 1개를 받아서 문자열 리턴
		// 1-1. [익명 클래스] anonymous inner class
		Function<Integer, String> anonymous = new Function<Integer, String>() {
			@Override
			public String apply(Integer t) {
				return "[익명 클래스] 매개변수 값은 " + t + "입니다.";
			}
		};
		System.out.println(anonymous.apply(100));

		// 1-2. [람다]
		Function<Integer, String> lambda = t -> "[람다] 매개변수 값은 " + t + "입니다.";
		System.out.println(lambda.apply(200));

		// [과제] 문자열 1개를 입력 받은 후, 문자열의 길이를 출력
		Function<String, Integer> quiz = t -> t.length();
		System.out.println("문자열의 길이 >> " + quiz.apply("안녕 좋은 오후"));
		System.out.println("String class의 length() >> "+ "안녕 좋은 오후".length());

		// 2. 정수 1개를 받아서 정수 리턴
		// [문제] 정수 1개를 받은 후, 제곱한 값을 리턴
		Function<Integer, Integer> power = num -> num * num;
		System.out.println("제곱 >> " + power.apply(5));

		// [문제] 정수 1개를 받은 후, 1증가한 값을 리턴
		Function<Integer, Integer> increment = sum -> sum + 1;
		System.out.println("1증가 >> " + increment.apply(6));
		
		// 순행
		System.out.println("<< 5를 1증가 후 제곱 >>");
		System.out.println(power.compose(increment).apply(5));
		
		// 역행
		System.out.println("<< 5를 제곱 후 1증가 >>");
		System.out.println(power.andThen(increment).apply(5));
		
		// 인수 그대로 리턴
		System.out.println(Function.identity().apply("좋은 하루"));
	}
}
