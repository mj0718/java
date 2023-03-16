@FunctionalInterface
interface Box {
	int boxing(int num);

	// [익명 클래스]
	default Box compose(Box before) {
		return new Box() {
			@Override
			public int boxing(int num) {
				return Box.this.boxing(before.boxing(num));
			}
		};
	}

	// [람다]
	default Box composeLambda(Box before) {
		return (int num) -> boxing(before.boxing(num));
	}

	// andThen
	// [익명 클래스]
	default Box andThen(Box after) {
		return new Box() {
			@Override
			public int boxing(int num) {
				return after.boxing(Box.this.boxing(num));
			}
		};
	}

	// [람다]
	default Box andThenLambda(Box after) {
		return (int num) -> after.boxing(boxing(num));
	}
}

public class FunctionalInterfaceQuiz {
	public static void main(String[] args) {
		Box power = num -> num * num;
		System.out.println("제곱 >> " + power.boxing(5));

		Box increment = num -> num + 1;
		System.out.println("1증가 >> " + increment.boxing(5));

		// 순행
		System.out.println("<< 1증가 후 제곱 >>");
		System.out.println(power.composeLambda(increment).boxing(5));
		System.out.println(power.compose(increment).boxing(6));

		// 역행
		System.out.println("<< 제곱 후 1증가 >>");
		System.out.println(power.andThenLambda(increment).boxing(5));
		System.out.println(power.andThen(increment).boxing(6));
	}
}
