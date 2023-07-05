package basic;

public class EmptyString {
	public static void main(String[] args) {
		String one = ""; // 빈 문자열
		String two = null;
		String three = "안녕";
		String whiteSpace = " ";

		System.out.println("one >> " + one);
		System.out.println("two >> " + two);

		// [빈 문자열 확인 1] equals() method
		System.out.println("one.equals() : " + one.equals(""));
		// System.out.println("two.equals() : "+two.equals("")); Exception: NullPointerException

		// [빈 문자열 확인 2] length() method
		System.out.println("one : 빈 문자열 길이 >> " + one.length());
		// System.out.println("two : null 길이 >> "+two.length());  Exception: NullPointerException

		// [빈 문자열 확인 3] isEmpty() method -> Java 6 이후 지원 - 문자열의 길이가 0인 경우 true 리턴
		System.out.println("one.isEmpty() >> " + one.isEmpty());
		System.out.println("three.isEmpty() >> " + three.isEmpty());
		
		// [빈 문자열 확인 4] isBlank() method -> Java 11 이후 지원 - 빈 문자열이거나 빈 공백만으로 이뤄진 경우 true 리턴
		System.out.println("one.isBlank() >> " + one.isBlank());
		System.out.println("three.isBlank() >> " + three.isBlank());
		System.out.println("whiteSpace.isBlank() >> " + whiteSpace.isBlank());
		
		
	}
}
