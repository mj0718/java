/*
 *  [변수 종류]
 *  						메모리 영역	|	메모리 할당 시기
 *  - 지역변수				stack		|	해당 영역이 실행
 *  - 멤버변수(instance)	heap		|	객체 생성될 때
 *  - 멤버변수(static)		static		|	class가 로드(load)될 때
 *  
 *  [static]
 *  - static(class) field(변수) 
 *  : class가 메모리에 로드(load)될 때, static(class) 영역에 할당
 *  : instance(객체) 생성과 상관없이 접근(사용) 가능 
 *  	-> 객체 생성과 상관없이 변수 사용하고자 할 때 사용
 *  : [문법] 클래스명.변수명
 *  : 해당 클래스로 생성된 객체들이 공유하는 변수
 *  
 *  - static(class) method(메소드)
 *  : class가 메모리에 로드(load)될 때, static(class) 영역에 할당
 *  : instance(객체) 생성과 상관없이 접근(사용) 가능 
 *  	-> 객체 생성과 상관없이 메소드 호출(사용)하고자 할 때 사용
 *  : [문법] 클래스명.메소드명()
 *  : static(class) 메소드 내에서는 static 멤버만 접근(사용) 가능
 *  -> 생성 시기가 다르므로 (static 멤버가 메모리 할당 후, 객체 생성 시 instance 멤버가 메모리 할당됨
 *  
 *  
 *   -final 변수
 *   : 변수를 상수화 => 상수
 *   : 변경 금지 => 값 변경 금지
 *   : 초기화한 값으로 값 고정
 *   
 *   : final은 변수, 매소드, 클래스에서 사용가능
 *  
 */

class Product {
	int year;
	String name;
	final String company;
	
	public Product(int year, String name, String company) {
		this.year = year;
		this.name=name;
		this.company=company;
	}
	
	
	public void setYear(int year) {
		this.year = year;
	}


	public void setName(String name) {
		this.name = name;
	}


//	public void setCompany(String company) {
//		this.company = company;
//	}

	void showInfo() {
		System.out.println("생산년도 : "+this.year);
		System.out.println("제품명 : "+this.name);
		System.out.println("제조회사 : "+this.company);
	}
}

public class VariableEx01 {
	public static void main(String[] args) {

		// 지역변수
		// 변수 선언
		final float PI = 3.14F;
		final int NUM;
		
		NUM=5;
		
		// num=7; Error : 값 변경 불가능
		
		// 객체 생성
		Product p1 = new Product(2020, "곰돌이", "다이소");
		p1.showInfo();
		
		// 멤버 변수의 값을 변경
		System.out.println("\n<< 생산년도 변경 >>");
		p1.setYear(2022);
		p1.showInfo();
		
		System.out.println("\n<< 제조회사 변경 >>");
		//p1.setCompany("이마트");
		p1.showInfo();
	}
}
