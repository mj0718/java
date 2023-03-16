package p230118;

public class TypeEx01 {
	
	//main method
	public static void main(String[] args) {
		
		//변수 선언과 동시에 초기화
		byte one = 127; //128부터는 값을 넣으면 에러가 뜸
		System.out.println("one : "+one);
		
		long two = 10000000000L;
		System.out.println("two : "+two);
		
		char three = 5;
		System.out.println("three: "+three);
	}

}
