package p230118;

public class Comment {
	
	public static void main(String[] args) {
		System.out.println(3+5);
		System.out.println("정수 : "+ 5);
		System.out.println("3 + 5 = "+ 3+5); //문자열로 취급하므로 결과값이 8이 안 나옴
		System.out.println("3 + 5 = "+ (3+5)); //연산자 우선순위가 높으므로 8이 나옴
		
	}

}
