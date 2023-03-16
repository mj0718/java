package p230118;

public class Type {
	
	public static void main(String[] args) {
		
		//변수 선언
		byte num;
		
		//초기화
		num=5;
		System.out.println("num : "+num);
		
		//변수 선언 동시에 초기화
		short two = 2;
		System.out.println("two : "+two);
		
		two = 220;  //자료형 붙이면 안 됨
		System.out.println("값 변경 후 two : "+two); //메모리는 항상 덮어쓰기여서 220이 오는 것임
		
	}

}
