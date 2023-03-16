package stream;

import java.util.stream.IntStream;

public class StreamEx01 {
	public static void main(String[] args) {
		
		// [중간연산] mapTo 
		// 형변환, 타입 변경
		// mapToInt(), mapToLong(), mapToDouble()
		// mapToObject()
		System.out.println("[mapTo] 형변환");
		double avg = IntStream.range(1, 11)
							.peek(System.out::println)
							.mapToDouble(n -> n)
							.average()
							.getAsDouble(); //optional double -> primitive double로 변환
		System.out.println("평균 >> "+avg);
	}
}
