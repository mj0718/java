package stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx02 {
	public static void main(String[] args) {

		// [최종연산] min, max, average
		// 리턴형 - Optional
		// 빈 Stream일 경우, Optional Empty 리턴
		int min = IntStream.of(1, 3, 5, 7, 9).min().getAsInt();
		System.out.println("min >> " + min);

		OptionalInt minOptional = IntStream.of(1, 3, 5, 7, 9).min();
		System.out.println("minOptional >> " + minOptional);
		System.out.println("minOptional의 값 >> " + minOptional.getAsInt());

		OptionalInt max = IntStream.of().max();
		System.out.println("최댓값 >> " + max);

		OptionalDouble average = IntStream.of().average();
		System.out.println("평균값 >> " + average);

		// [문제] 평균값 출력
		IntStream.of(1, 3, 5, 7, 9).average().ifPresent(System.out::println);

		int minValue = IntStream.of().min().orElse(0);
		System.out.println("최솟값 >> " + minValue);

		// sum, count : 빈 Stream일 경우 0 리턴
		
		int sum = IntStream.of().sum();
		System.out.println("sum >> " + sum);

		Long count = IntStream.of(1, 3, 5).count();
		System.out.println("cont >> " + count);

	}
}
