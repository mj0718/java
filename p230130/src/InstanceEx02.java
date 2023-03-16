class Robot {
	int productYear;
	String productName;

	public int getProductYear() {
		return productYear;
	}

	public void setProductYear(int productYear) {
		this.productYear = productYear;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}

public class InstanceEx02 {
	public static void main(String[] args) {

		Robot r1 = new Robot();
		r1.setProductYear(2017);
		r1.setProductName("Emmet");

		System.out.println("r1의 생산년도 >> " + r1.getProductYear());
		System.out.println("r1의 제품명 >> " + r1.getProductName());

		// 주소 복사
		Robot r3 = r1;
		System.out.println("r3의 제품명 >> " + r3.getProductName());
	}
}
