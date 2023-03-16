
public class TypeCastingEx01 {

	public static void main(String[] args) {

		int n1 = 9;
		int n2 = 2;
		
		System.out.println("n1 / n2 = "+n1/n2);
		System.out.println("n1 / n2 = "+n1/(float)n2);
		System.out.println("n1 / n2 = "+(float)(n1/n2));
		
		//===============================================
		
		int num = 100;
		short sh = (short)num;
		byte by = (byte)num;
		long lo = num;
		float fo = num;
		double db = num;
		
	}

}
