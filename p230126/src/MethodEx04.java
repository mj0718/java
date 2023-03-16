
public class MethodEx04 {
	
	// [형태 4] 매개변수 없고, 리턴값 있음
	// 기능: 호출하면 문자열 출력
	public static String returnString() {
		return "좋은 아침";
	}
	
	public static void main(String[] args) {
		//[메소드 호출]
		// 1. 변수 저장
		String str=returnString();
		System.out.println("메소드 호출 결과 1) >> "+str);
		
		// 2. 출력
		System.out.println("메소드 호출 결과 2) >> "+returnString());
	}
}
