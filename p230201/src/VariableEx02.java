class Item {
	int year;
	String name;
	final String company;

	public Item(int year, String name, String company) {
		this.year = year;
		this.name = name;
		this.company = company;
	}

	// final은 setter를 통한 초기화 불가능
//	void setCompany(String company) {
//		this.company=company;
//	}

	void showInfo() {
		System.out.println("생산년도 : " + this.year);
		System.out.println("제품명 : " + this.name);
		System.out.println("제조회사 : " + this.company);
	}
}

public class VariableEx02 {
	public static void main(String[] args) {

		Item item = new Item(2022, "곰돌이", "다이소");
		item.showInfo();

		Item itemTwo = new Item(2020, "곰순이", "이마트");
		itemTwo.showInfo();

	}
}
