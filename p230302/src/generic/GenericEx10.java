package generic;

class Person {
	private String name;

	public Person(String name) {
		this.name= name;
	}
	@Override
	public String toString() {
		return this.name;
	}
}

public class GenericEx10 {
	// [제네릭 메서드] 제네릭 파라미터 타입이 배열
	public static <T> void showArray(T[] t) {
		for (T type: t) {
			System.out.println(type);
		}
	}
	public static void main(String[] args) {
		String[] str = {"안녕", "좋은 오후"};
		showArray(str);
		
		// [문제] Person class로 길이가 2인 배열 생성
		// showArray() 호출하여 출력이 다음과 같이 되도록 하시오
		// 홍길동
		// 박보검
		Person[] person = {new Person("홍길동"), new Person("박보검")};
		showArray(person);	
	}
}
