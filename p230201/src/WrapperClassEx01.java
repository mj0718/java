/*
 *  [Wrapper Class]
 *  Byte - Short - Character - Integer - Long 
 *  Float - Double
 *  Boolean
 *  ===========================================
 *  << 자동형변환 >>
 *  			boxing
 *  기본형 		------>  	참조형
 *  primitive type   	reference type
 *  			<------
 *  			unboxing
 */

public class WrapperClassEx01 {
	public static void main(String[] args) {

		int num = 5;
		Integer num2 = 5;
		// Integer num3 =new Integer(5); 이 방법은 안쓰는걸 권장
		Integer num3 = Integer.valueOf(5);
		System.out.println(num3);
		int num4 = num3;

	}
}
