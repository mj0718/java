package method.reference;

import java.util.Arrays;
import java.util.Comparator;

public class MethodReferenceEx02 {
	public static void main(String[] args) {
		String[] arr = { "A", "c", "E", "d", "b" };

		// 정렬: 오름차순 정렬 - 대소문자 구분
		System.out.println("정렬 전: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("정렬 후: " + Arrays.toString(arr));

		// 정렬: 오름차순 정렬 - 대소문자 구분 없이
		// 1. 익명 클래스
//		Arrays.sort(arr, new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.compareToIgnoreCase(s2);
//			}
//		});
//		System.out.println("[익명 클래스] >> " + Arrays.toString(arr));
		// 2. 람다
//		Arrays.sort(arr, (String s1, String s2) -> s1.compareToIgnoreCase(s2));
//		System.out.println("[람다] >> " + Arrays.toString(arr));
		// 3. 메서드 참조
		Arrays.sort(arr, String::compareToIgnoreCase);
		System.out.println("[메서드 참조] >> " + Arrays.toString(arr));
	}
}
