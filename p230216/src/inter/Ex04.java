package inter;

interface Vehicle {
	void printNumber();
}

class Car implements Vehicle {
	int carNumber;

	public Car(int carNumber) {
		this.carNumber = carNumber;
	}

	@Override
	public void printNumber() {
		System.out.println("자동차 등록번호 : " + carNumber);
	}

	public void drive() {
		System.out.println("자동차가 고속도로를 달립니다.\n");
	}
}

class Yacht implements Vehicle {
	int yachtNumber;

	public Yacht(int yachtNumber) {
		this.yachtNumber = yachtNumber;
	}

	@Override
	public void printNumber() {
		System.out.println("요트 등록번호 : " + yachtNumber);
	}

	public void sail() {
		System.out.println("요트가 한강 위를 떠다닙니다.\n");
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Vehicle[] myVehicle = new Vehicle[2];
		myVehicle[0] = new Car(8586);
		myVehicle[1] = new Yacht(679111);
		
		// 반복문 사용하여 drive 메서드, sail 메서드 호출
		// printNumber method 정의 후 호출
		// <실행결과>
		// 자동차 등록번호 : 8586
		// 자동차가 고속도로를 달립니다.
		// 요트 등록번호 : 679111
		// 요트가 한강 위를 떠다닙니다.

		for (Vehicle i : myVehicle) {
			i.printNumber();
			if (i instanceof Car)
				((Car) i).drive();
			else if (i instanceof Yacht)
				((Yacht) i).sail();
		}
	}
}