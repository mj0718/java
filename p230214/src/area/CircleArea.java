package area;

public class CircleArea {
	private double rad;
	private final double PI;

	// 생성자
	public CircleArea(double r) {
		rad = r;
		PI = 3.14;
	}

	public double getArea() {
		return (rad * rad) * PI;
	}
}

//public class CircleArea {
//	public static void main(String[] args) {
//		Circle c = new Circle(1.5);
//		System.out.println("반지름이 1.5인 원의 넓이: " + c.getArea());
//	}
//}
