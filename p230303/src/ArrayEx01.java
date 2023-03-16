import java.util.Arrays;

public class ArrayEx01 {
	public static void main(String[] args) {
		// 1. 길이가 3인 String 1차원 배열
		String[] str = new String[3];
		str[0]="one";
		str[1]="two";
		str[2]="three";
		
		// 2. 배열 요소 출력 --------------------------------------------
		// 향상된 for문
		for(String s : str)
			System.out.println(s);
		
		// 배열을 문자열로 출력
		System.out.println("<< 배열을 문자열로 출력 >>");
		System.out.println(Arrays.toString(str));
		
		// 3. 배열 복사 -------------------------------------------------
		// 3-1. 얕은 복사: shallow copy
		String[] shallowCopy = str;
		
		System.out.println("\n[shallowCopy 배열]");
		for(String s: shallowCopy)
			System.out.println(s);
		
		// 요소 변경: 인덱스 1의 값을 ten 변경
		shallowCopy[1] ="ten";
		
		System.out.println("\n<< 인덱스 1의 값을 ten 변경 후 >>");
		System.out.println("\n[shallowCopy 배열]: 복사본");
		for(String s: shallowCopy)
			System.out.println(s);
		
		System.out.println("\n[str 배열]: 원본");
		for(String s : str)
			System.out.println(s);
		
		// 3-2. 깊은 복사: deep copy
		String[] deepCopy = Arrays.copyOf(str, 10);
		
		for (int i=0; i<deepCopy.length; i++)
			System.out.printf("deepCopy[%d] : %s\n", i, deepCopy[i]);
		
		// 인덱스 0의 값을 '안녕~'으로 변경
		deepCopy[0]="안녕~";
		
		System.out.println("\n<< 인덱스 0의 값을 '안녕~'으로 변경 후 >>");
		System.out.println("[deepCopy 배열]");
		for(String s : deepCopy)
			System.out.println(s);
		
		System.out.println("\n[str 배열]: 원본");
		for(String s : str)
			System.out.println(s);
		
	}
}












