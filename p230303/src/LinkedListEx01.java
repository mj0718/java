import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx01 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		// 저장된 요소(노드) 존재 여부
		System.out.println("비어있나요? " + list.isEmpty());

		// 요소(노드) 추가
		list.add("하나");
		list.add("둘");
		list.add("셋");
		list.add("하나");

		// 저장된 요소(노드) 존재 여부
		System.out.println("비어있나요? " + list.isEmpty());

		// 특정 위치에 저장된 요소 출력
		System.out.println("인덱스 1 >> " + list.get(1));

		// 요소(노드) 개수
		System.out.println("저장된 요소 개수 >> " + list.size());

		// 객체 존재 여부
		System.out.println("요소 '둘' 있나요? " + list.contains("둘"));
		System.out.println("요소 '넷' 있나요? " + list.contains("넷"));

		// 저장된 요소 전체 출력
		System.out.println("\n<< for문 >>");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		System.out.println("\n<< 향상된 for문 >>");
		for (String s : list)
			System.out.println(s);

		System.out.println("\n<< toArray() >>");
		for (Object obj : list.toArray())
			System.out.println(obj);

		System.out.println("\n<< iterator() >>");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) { // 찾아갈 요소가 있는지 확인
			System.out.println(iter.next());
		}

		// 같은지 비교
		for (String s : list)
			System.out.println("'셋'과 같나요? " + s.equals("셋"));

		// 특정 요소 변경: 둘 -> 여섯
		System.out.println("\n<< 요소 둘을 여섯으로 변경 후 >>");
		list.set(list.indexOf("둘"), "여섯");
		for (String s : list)
			System.out.println(s);
		
		// 특정 요소 삭제: 
		System.out.println("\n<< 요소 셋 삭제 >>");
		list.remove("셋");
		
		System.out.println("요소 개수 >> "+list.size());
		
		for (String s: list)
			System.out.println(s);
		
		
	}
}
