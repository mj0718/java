/*
 * [컬렉션] collection
 * - 자료구조(data) + 알고리즘
 * - field + method
 * - 데이터를 묶어서 관리 및 사용을 쉽게하기 위한 구조
 * - 사용하는 목적은 배열과 같지만, 제공하는 기능(메서드)은 배열보다 다양함
 * 
 * [컬렉션 프레임워크] collection framework
 * - 컬렉션 클래스와 인터페이스의 집합 
 * - 프로그래밍 편리성, 통합된 API 구조로 인한 효율성 증대
 * 
 * ================================================================================================
 * 								순서  |		중복허용	|	구현 클래스
 * ================================================================================================
 * collection<E>  <- List<E>	O				O		 	ArrayList, LinkedList, Stack, Queue
 * 				  <- Set<E>		X				X			HashSet, TreeSet
 * 
 * Map<K, V> 					X		key: X, value: O	HashMap, TreeMap
 * 
 */

package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionFrameworkEx01 {
	public static void main(String[] args) {
		// ArrayList 객체 생성: 리스트 생성
		ArrayList<String> arrayList = new ArrayList<String>();

		// 저장된 요소
		System.out.println("비어있나요? >> " + arrayList.isEmpty());

		// 요소 개수
		System.out.println("[요소 추가 전] 저장된 요소 개수 >> " + arrayList.size());

		// 요소 추가
		arrayList.add("하나");
		arrayList.add("둘");
		arrayList.add("셋");
		arrayList.add("넷");

		// 요소 개수
		System.out.println("[요소 추가 후] 저장된 요소 개수 >> " + arrayList.size());

		// 특정 위치에 저장된 요소 접근
		System.out.println("인덱스 0 >> " + arrayList.get(0));
		System.out.println("인덱스 0 >> " + arrayList.get(2));

		// 객체 포함 여부 확인
		System.out.println("둘 있나요? " + arrayList.contains("둘"));
		System.out.println("여섯 있나요? " + arrayList.contains("여섯"));

		// [저장된 요소 전체 출력 1] 일반 for문
		System.out.println("<< 요소 전체 출력 1 >>");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		// [저장된 요소 전체 출력 2] 향상된 for문
		System.out.println("<< 요소 전체 출력 2 >>");
		for (String str : arrayList)
			System.out.println(str);
		// [저장된 요소 전체 출력 3] toArray()
		System.out.println("<< 요소 전체 출력 3 >>");
		for (Object obj : arrayList.toArray())
			System.out.println(obj);
		// [저장된 요소 전체 출력 4] iterator => 1회용임(쓸 때마다 만들어줘야함)
		System.out.println("<< 요소 전체 출력 4 >>");
		Iterator<String> iter = arrayList.iterator();
		while (iter.hasNext()) { //찾아갈 요소가 있는지 확인
			System.out.println(iter.next());
		}
		System.out.println("[iter] 두 번째 사용");
		iter = arrayList.iterator();
		while (iter.hasNext()) {
			System.out.println("두 번째 >> " + iter.next());
		}

		// 특정 객체가 요소와 같은지 비교
		for (int index = 0; index < arrayList.size(); index++)
			System.out.println("[셋]과 같나요? " + arrayList.get(index).equals("셋"));

		// 특정 요소 변경
		System.out.println("<< 셋 -> 여섯 변경 >>");
		arrayList.set(2, "여섯");
		for (String str : arrayList)
			System.out.println(str);

		// 특정 요소 삭제
		System.out.println("<< 요소 '둘' 삭제 >>");
		Boolean result = arrayList.remove("둘");
		System.out.println("삭제 결과 >> " + result);

		// 삭제 결과 확인(반복문)
		for (String str : arrayList)
			System.out.println(str);

		// 요소 개수
		System.out.println("요소 개수 >> " + arrayList.size());

		// 요소 추가(중복 요소): 하나 => 마지막 위치에 추가됨
		arrayList.add("하나");
		for (String str : arrayList)
			System.out.println(str);

		// 요소 추가(인덱스 1의 자리에 다섯 추가)
		System.out.println("<< 요소 추가 (인덱스 1의 자리에 다섯 추가) >>");
		arrayList.add(1, "다섯");
		for (String str : arrayList)
			System.out.println(str);

		// 모든 요소 삭제
		arrayList.clear();
		System.out.println("모든 요소 삭제 후 요소 개수 >> " + arrayList.size());
	}
}
