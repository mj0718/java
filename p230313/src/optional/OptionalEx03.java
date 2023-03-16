package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx03 {
	
	public static Optional<String> findByName(String name) {
		List<String> result = Arrays.asList("홍길동", "박보검", "이미자");
		for (String s : result) {
			if(s.equals(name))
				return Optional.ofNullable(s);
		}
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		System.out.println("[이름 찾기 1] 이미자 >> "+findByName("이미자"));
		System.out.println("[이름 찾기 2] 하늘 >> "+findByName("하늘"));
		
		System.out.println("[이름 찾기 1] 이미자 길이 >> "+findByName("이미자").get().length());
		
//		System.out.println("[이름 찾기 2] 하늘 길이 >> "+findByName("하늘").length());
//		String findName = findByName("하늘");
//		
//		if (findName != null)
//			System.out.println("[이름 찾기 2] 하늘 길이 >> "+findByName("하늘").length());
		
		Optional<String> sky = findByName("하늘");
		if (sky.isPresent())
			System.out.println("[이름 찾기 2] 하늘 길이 >> "+findByName("하늘").get().length());
	}
}
