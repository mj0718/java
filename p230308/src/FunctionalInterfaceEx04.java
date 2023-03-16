import java.util.function.Predicate;

public class FunctionalInterfaceEx04 {

	public static void main(String[] args) {
		// Predicate<T>: 매개변수 T 1개 있음, 반환값 있음(Boolean)
		
		// 양수 음수 구분
		// 0 이상 -> true
		// 0 미만 -> false
		Predicate<Integer> positive = s -> s>=0;
		System.out.println("1은 양수인가요? "+positive.test(1));
		System.out.println("-1은 음수인가요? "+positive.test(-1));
	}

}
