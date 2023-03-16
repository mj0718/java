package method.reference;

import java.util.function.Function;

@FunctionalInterface
interface Greeting {
	int say(String str);
}

public class MethodReferenecEx01 {
	public static void main(String[] args) {
		// 1. 익명 클래스
		Greeting anonymous = new Greeting() {

			@Override
			public int say(String str) {
				return str.length();
			}
		};
		System.out.println("[익명 클래스] 문자열 길이 >> " + anonymous.say("좋은 하루"));

		// 2. 람다
		Greeting lambda = (String str) -> str.length();
		System.out.println("[람다] 문자열 길이 >> " + lambda.say("즐거운 하루"));

		// 3. 메서드 참조
		Greeting reference = String::length;
		System.out.println("[메서드 참조] 문자열 길이 >> " + reference.say("즐거운 금요일"));

		// [문제] generic functional interface 사용
		// 1. 익명 클래스
		Function<String, Integer> quizAnonymous = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		System.out.println("[익명 클래스] 문자열 길이 >> " + quizAnonymous.apply("좋은 하루"));
		// 2. 람다
		Function<String, Integer> quizLambda = (String t) -> t.length();
		System.out.println("[람다] 문자열 길이 >> " + quizLambda.apply("즐거운 하루"));
		// 3. 메서드 참조
		Function<String, Integer> quizReference = String::length;
		System.out.println("[메서드 참조] 문자열 길이 >> " + quizReference.apply("즐거운 금요일"));
	}
}
