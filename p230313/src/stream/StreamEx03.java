package stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx03 {
	public static void main(String[] args) {

		// [최종연산] match
		// 조건 검사
		// Stream의 요소들이 특정한 조건을 충족하는지 검사하고 싶은 경우
		// Predicate를 받아서 해당 조건 여부 검사 : boolean 리턴

		// < match 메서드 >
		// anyMatch: 1개 요소라도 해당 조건을 만족하는가? -> true
		// allMatch: 모든 요소가 해당하는 조건을 만족하는가? -> true
		// noneMatch: 모든 요소가 해당 조건을 만족하지 않는가? -> true

		// anyMatch
		List<String> names = Arrays.asList("홍길동", "이미자", "박보검");
		boolean anyMatch = names.stream().anyMatch(n -> n.contains("미"));
		System.out.println("anyMatch >> " + anyMatch);

		// allMatch
		boolean allMatch = names.stream().allMatch(n -> n.contains("미"));
		System.out.println("allMatch >> " + allMatch);

		// noneMatch
		boolean noneMatch = names.stream().noneMatch(n -> n.contains("미"));
		System.out.println("noneMatch >> " + noneMatch);
	}
}
