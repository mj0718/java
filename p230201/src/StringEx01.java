
public class StringEx01 {
	public static void main(String[] args) {

		String s = "안녕";
		String s2 = "안녕";
		String s3 = new String("안녕");
		String s4 = new String("안녕");

		System.out.println("참조변수 s에 저장된 문자열의 시작 주소: " + s);

		if (s3 == s4)
			System.out.println("주소 같다.");
		else
			System.out.println("주소 다르다");

		// String 객체에 저장된 문자열
		System.out.println("문자열 비교 >> " + s3.equals(s4));

		// String 객체 배열 생성과 동시에 초기화
		// String[] strArr = new String[] { new String("Java"), new String("HTML"), new String("Python") };
		// String[] strArr = { new String("Java"), new String("HTML"), new String("Python") };
		String[] strArr = { "Java", "HTML", "Python" };

		// [향상된 for문] 문자열 출력
		for (String str : strArr)
			System.out.println(str);

	}
}
