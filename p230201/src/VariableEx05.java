class Animal {

	final static int COUNT = 5; // 값 고정 final과 static 순서는 상관없음

}

public class VariableEx05 {
	public static void main(String[] args) {

		System.out.println("동물 몇 마리 >> " + Animal.COUNT);
		// Animal.count=10;
		System.out.println("현재 동물 몇 마리 >> " + Animal.COUNT);
	}
}
