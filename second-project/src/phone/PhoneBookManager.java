package phone;

public class PhoneBookManager {
	private final int MAX_CNT = 100;
	private PhoneBookInfo[] infoStorage = new PhoneBookInfo[MAX_CNT];
	private int index = 0;

	private int search(String name) {
		for (int i = 0; i < index; i++) {
			if (name.equals(infoStorage[i].name)) {
				return i;
			}
		}
		return -1;
	}

	public void inputData() {
		System.out.println("\n데이터 입력을 시작합니다..");
		System.out.print("이름: ");
		String name = MenuViewer.INPUT.next();
		System.out.print("전화번호: ");
		String phoneNumber = MenuViewer.INPUT.next();
		infoStorage[index++] = new PhoneBookInfo(name, phoneNumber);
		System.out.println("데이터 입력이 완료되었습니다.");
	}

	public void searchData() {
		System.out.println("\n데이터 검색을 시작합니다..");
		System.out.print("이름: ");
		String name = MenuViewer.INPUT.next();
		int result = search(name);
		if (result == -1)
			System.out.println("해당하는 데이터가 존재하지 않습니다");
		else {
			infoStorage[result].showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다.");
		}
	}

	public void deleteData() {
		System.out.println("\n데이터 삭제를 시작합니다..");
		System.out.print("이름: ");
		String name = MenuViewer.INPUT.next();
		int result = search(name);
		if (result == -1) {
			System.out.println("해당하는 데이터가 존재하지 않습니다.");
			return;
		}
		for (int i = result; i < index; i++) {
			infoStorage[i] = infoStorage[i + 1];
		}
		index--;
		System.out.println("데이터 삭제가 완료되었습니다.");
	}

	public void showData() {
		System.out.println("\n<< 저장된 데이터 >>");
		for (int i = 0; i < index; i++) {
			infoStorage[i].showPhoneInfo();
		}
		System.out.println();
	}
}
