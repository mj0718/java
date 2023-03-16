class Person {
	@Override
	public String toString() {
		return "Person";
	}
}
public class PolymorphismEx04 {
	public static void main(String[] args) {

		Person person = new Person();
		System.out.println(person.toString());
	}
}
