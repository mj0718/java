package optional;

import java.util.Arrays;
import java.util.List;

public class OptionalEx01 {
	public static void main(String[] args) {
		List<String> result = Arrays.asList("홍길동", "박보검", "이미자");
		for (String s : result) {
			if(s.equals("이미자"))
				System.out.println(s);
		}
	}
}
