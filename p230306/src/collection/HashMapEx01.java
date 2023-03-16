package collection;

import java.util.HashMap;

public class HashMapEx01 {
	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		// 요소 개수
		System.out.println("[요소 추가 전] 개수 >> " + hashMap.size());

		// 요소 추가
		hashMap.put("하나", 1);
		hashMap.put("둘", 2);
		hashMap.put("셋", 3);
		hashMap.put("하나", 111); // 동일한 값이면 기존의 값이 지워지고 나중의 값이 출력됨

		// 요소 개수
		System.out.println("[요소 추가 후] 개수 >> " + hashMap.size());

		// [출력] 저장된 요소 전체 출력
		System.out.println("hashMap >> " + hashMap);

		// [출력] 저장된 키들의 집합: 키만 추출
		System.out.println("\n<< 저장된 모든 키 출력 >>");
		System.out.println(hashMap.keySet());

		// [출력] 저장된 키들의 집합: 값만 추출
		System.out.println("\n<< 저장된 모든 값 출력 >>");
		System.out.println(hashMap.values());

		// [출력] 키를 통한 값 출력: 특정 키의 값 추출
		System.out.println("\n키가 둘인 요소의 값 >> " + hashMap.get("둘"));

		// [출력] 키를 통한 값 출력: 모든 요소의 값 추출
		System.out.println("\n<< 키와 값 출력 >>");
		for (String i : hashMap.keySet())
			System.out.printf("key: %s, value : %d\n", i, hashMap.get(i));

		// [수정] 키를 통한 값 변경
		hashMap.replace("하나", 100);
		System.out.println("\n<< 키가 하나인 요소의 값을 100으로 변경 후 >>");
		System.out.println(hashMap);

		// [삭제] 키를 통한 특정 요소 삭제
		hashMap.remove("하나");
		System.out.println("\n<< 키가 하나인 요소 삭제 후 >>");
		System.out.println(hashMap);
	}
}
