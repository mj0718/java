package collection;

import java.util.ArrayList;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// setter/getter 추가
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class ArrayListQuiz {
	public static void main(String[] args) {

		Person hong = new Person("홍길동", 25);
		Person park = new Person("박보검", 35);
		// Person lee = new Person("이미자", 52);

		// [문제] ArrayList에 hong, park, lee를 저장(요소 추가)하시오
		ArrayList<Person> arrayList = new ArrayList<Person>();
		arrayList.add(hong);
		arrayList.add(park);
		arrayList.add(new Person("이미자", 52));
		arrayList.add(new Person("홍길동",47));

		// 저장된 이름 전체 출력
		System.out.println("<< 저장된 이름 전체 출력 >>");
		System.out.println("1. 일반 for문");
		for (int i = 0; i < arrayList.size(); i++)
			System.out.println(arrayList.get(i).getName());

		System.out.println("2. 향상된 for문");
		for (Person per : arrayList)
			System.out.println(per.getName());

		System.out.println("3. toArray()");
		for (Object obj : arrayList.toArray())
			System.out.println(((Person) obj).getName()); // 강제 형변환

		// 저장된 전체 요소 개수
		System.out.println("\n<< 저장된 전체 요소 개수 >>");
		System.out.println(arrayList.size());

		// 인덱스 1의 이름
		System.out.println("\n<< 인덱스 1의 이름 >>");
		System.out.println(arrayList.get(1).getName());

		// 35세 박보검 포함 여부
		System.out.println("\n<< 35세 박보검 포함 여부 >>");
		System.out.println("박보검 있나요? >> " + arrayList.contains(park));

		// 52세 이미자 포함 여부 -주소 비교이므로 객체 주소가 달라 false
		System.out.println("\n<< 52세 이미자 포함 여부 >>");
		System.out.println("이미자 확인 되나요? >> " + arrayList.contains(new Person("이미자", 52)));

		// 홍길동 이름을 화이팅으로 변경
		System.out.println("\n<< 홍길동 이름을 화이팅으로 변경 >>");
		// [방법 1] 홍길동 객체가 저장된 인덱스 아는 경우
		// arrayList.get(0).setName("화이팅");

		// [방법 2] 홍길동 객체가 저장된 인덱스 모르는 경우
		// 2-1. 객체 주소 비교
//		for (Person per: arrayList) {
//			if(per.equals(hong))
//				per.setName("화이팅");
//		}

		// 2-2. 저장된 이름을 직접 비교
		for (Person per : arrayList) {
			//if (per.getName().equals("홍길동")) 
			if("홍길동".equals(per.getName())) {	// 고정된 값으로 비교
				per.setName("화이팅");
				break;
			}
		}
		for (Person per : arrayList)
			System.out.println(per.getName());
	}
}