class Car {
	int door;
	String color;

	Car() {
		this(4, "black");
	}

	Car(int door) {
		this(door, "black");
	}

	Car(String color) {
		this(4, color);
	}

	Car(int door, String color) {
		this.door = door;
		this.color = color;
	}

	void carInfo() {
		System.out.println("문 개수 : " + door);
		System.out.println("색 : " + color);
		System.out.println();
	}
}

public class ConstructorQuiz {
	public static void main(String[] args) {

		Car c1 = new Car();
		c1.carInfo();

		Car c2 = new Car(2);
		c2.carInfo();

		Car c3 = new Car("white");
		c3.carInfo();

		Car c4 = new Car(6, "grey");
		c4.carInfo();

	}
}
