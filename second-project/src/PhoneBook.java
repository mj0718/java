import phone.MenuViewer;
import phone.PhoneBookManager;

public class PhoneBook {
	public static void main(String[] args) {
		
		PhoneBookManager manager = new PhoneBookManager();
		
		menu: while (true) {
			MenuViewer.showMenu();
			int input = MenuViewer.INPUT.nextInt();

			switch (input) {
			case 1: {
				manager.inputData();
				break;
			}
			case 2: {
				manager.searchData();
				break;
			}
			case 3: {
				manager.deleteData();
				break;
			}
			case 4: {
				manager.showData();
				break;
			}
			case 5: {
				System.out.println("프로그램을 종료합니다.");
				break menu;
			}
			default:
			}
		}
	}
}
