import java.util.Arrays;
import java.util.function.Consumer;

public class FunctionalInterfaceEx02 {
	public static void main(String[] args) {
		// Consumer: 매개변수 T 1개, 반환값 없음

		// 익명 클래스
		Consumer<String> anonymous = new Consumer<String>() {
			@Override
			public void accept(String str) {
				System.out.println(str);
			}
		};
		anonymous.accept("[익명 클래스] 오늘도 즐거운 하루");

		// 람다
		Consumer<String> lambda = str -> System.out.println(str);
		lambda.accept("[람다] 오늘도 즐거운 하루");

		// 문자열.split() : 특정 문자를 기준으로 나누기 ==================

		// 공백 기준으로 문자열 나누기
		System.out.println("문자열 나누기 작업 중".split(" "));
		System.out.println("문자열 나누기 작업 중".split(" ")[2]);

		// String 1차원 배열 참조변수에 저장
		// 1. 공백 기준: 문자열 모두 나누기 s >> [문자열, 나누기, 작업, 중]
		String s[] = "문자열 나누기 작업 중".split(" ");
		System.out.println("s >> " + Arrays.toString(s));

		// 2. 공백 기준: 문자열 2개로 나누기 s2 >> [문자열, 나누기 작업 중]
		String s2[] = "문자열 나누기 작업 중".split(" ", 2);
		System.out.println("s2 >> " + Arrays.toString(s2));

		// 3. 공백 기준: 문자열 3개로 나누기 s3 >> [문자열, 나누기, 작업 중]
		String s3[] = "문자열 나누기 작업 중".split(" ", 3);
		System.out.println("s3 >> " + Arrays.toString(s3));

		// 4. 공백 기준: 문자열 10개로 나누기 -> 4개로 나눠짐 s4 >> [문자열, 나누기, 작업, 중]
		String s4[] = "문자열 나누기 작업 중".split(" ", 10);
		System.out.println("s4 >> " + Arrays.toString(s4));

		String s5[] = "문자열 나누기 작업 중".split("나누");
		System.out.println("s5 >> " + Arrays.toString(s5));

		String s6[] = "문자열 나누기 작업 중".split("만약");
		System.out.println("s6 >> " + Arrays.toString(s6));

		// [문제] 문자열을 입력 받은 후, 공백 기준 두 번째 문자열 출력
		Consumer<String> quiz = str -> System.out.println(str.split(" ")[1]);
		quiz.accept("오늘도 즐거운 하루");

		Consumer<String> quizAnonymous = new Consumer<String>() {
			@Override
			public void accept(String str) {
				String[] s=str.split(" ");
				System.out.println(s[1]);
			}
		};
		quizAnonymous.accept("오늘도 즐거운 하루");
	}
}
