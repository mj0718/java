package anonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnonymousEx04 {
	public static void main(String[] args) {

		// ArrayList 생성
		ArrayList<String> hangul = new ArrayList<String>();
		hangul.add("하늘");
		hangul.add("나비");
		hangul.add("돌");
		hangul.add("바람");

		System.out.println("정렬 전 : " + hangul);

		// [오름차순 1] Collections.sort() =========================
		Collections.sort(hangul);
		System.out.println("정렬 후 : " + hangul);

		// [내림차순]
		Collections.sort(hangul, Collections.reverseOrder());
		System.out.println("내림차순 정렬 후 : " + hangul);

		// [오름차순 2] List.sort() => Java 8 이후부터 적용 ========
		hangul.sort(Comparator.naturalOrder());
		System.out.println("정렬 후 : " + hangul);

		// [내림차순]
		hangul.sort(Comparator.reverseOrder());
		System.out.println("내림차순 정렬 후 : " + hangul);

		// [오름차순 3] Comparator 인터페이스 구현 =================
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2); //오름차순
				//return s2.compareTo(s1); //내림차순
			}
		};
		// 오름차순 정렬
		hangul.sort(comparator);
		System.out.println("정렬 후 :" + hangul);

		// << String class : compareTo() method >>
		// [문법] 첫번째인수.compareTo(두번째인수)
		// 양수: 순서 교체 -> 첫번째 인수가 크다
		// 음수: 순서 유지 -> 첫번째 인수가 작다
		// 0: 순서 유지 -> 서로 같다

		// 1. 오름차순: return s1.compareTo(s2);
		// 1-1. [데이터 순서] CAB
		System.out.println("C와 A 비교 >> " + "C".compareTo("A"));
		// 1-2. [데이터 순서] ACB
		System.out.println("C와 B 비교 >> " + "C".compareTo("B"));
		// 1-3. [데이터 순서] ABC

		// 2. 내림차순: return s2.compareTo(s1);
		// 2-1. [데이터 순서] CAB
		System.out.println("A와 C 비교 >> " + "A".compareTo("C"));
		// 2-2. [데이터 순서] CAB
		System.out.println("A와 B 비교 >> " + "A".compareTo("B"));
		// 2-3. [데이터 순서] CBA

	}
}
