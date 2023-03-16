/*
 * [Stream] 스트림
 * << 스트림 생성 >>
 * - 컬렉션, 배열만 가능
 * 
 * << 단계 >>
 * 생성 -> 가공 -> 결과
 * Stream 객체 생성 -> 중간연산 -> 최종연산
 * 
 * << 특징 >>
 * - 원본 데이터를 변경하지 않음 : 복사본
 * - 일회용
 * - 내부 반복으로 작업 처리
 */

package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx01 {
	public static void main(String[] args) {
		// [작업] 1차원 배열을 오름차순 정렬 후 출력
		// [방법 1] 
		// 1차원 배열 생성
		String[] arr = {"하나", "둘", "셋", "넷"};
		
		// 정렬 : 오름차순
		Arrays.sort(arr);
		
		// 출력 : 원본 변경
		for(String s :arr)
			System.out.println(s);
		
		
		// [방법 2] 
		// 1차원 배열 생성
		String[] arrTwo = {"하나", "둘", "셋", "넷"};
		
		// Stream 객체 생성
		Stream<String> stream = Arrays.stream(arrTwo);
		
		// 정렬
		System.out.println("[방법 2] ");
		stream.sorted().forEach(System.out::println);
		
		// Stream 객체는 1회용
		// 사용한 Stream 객체를 다시 사용(재사용)하면 Exception 발생
		//Stream<String> s = stream.sorted(); Error
		
		// 원본 arrTwo 배열 출력
		System.out.println("[원본] 배열 arrTwo 출력");
		for (String s : arrTwo)
			System.out.println(s);
		
		// 새 Stream 객체 생성
		stream=Arrays.stream(arrTwo);
		
		// 내림차순 정렬 후 출력
		System.out.println("<< 내림차순 정렬 후 출력 >>");
		stream.sorted(Comparator.reverseOrder())
				.forEach(System.out::println);
	}
}