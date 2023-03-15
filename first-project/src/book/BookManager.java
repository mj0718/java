package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
	// 배열을 지우고 ArrayList를 이용하여 AnimalInfo를 저장하시오.
	private ArrayList<AnimalInfo> infoStorage = new ArrayList<AnimalInfo>();

	//private final int MAX_CNT = 100;
	// private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];
	//private int index = 0;
	public static Scanner input = new Scanner(System.in);

	public void inputData() {
		System.out.println("<< 정보를 입력하세요 >>");
		System.out.print("1. 이름 : ");
		String name = input.next();
		System.out.print("2. 나이 : ");
		int age = input.nextInt();
		// infoStorage[index++] = new AnimalInfo(name, age);
		infoStorage.add(new AnimalInfo(name, age));
		System.out.println("데이터 입력이 완료되었습니다.\n");
	}

	public void showBook() {
		// [방법 1]
//		for (int i = 0; i < index; i++)
//			infoStorage[i].showAnimalInfo();
		// [방법 2]
//		for (AnimalInfo i : infoStorage) {
//			if (i == null)
//				break;
//			i.showAnimalInfo();
//		}
		// ArrayList 사용 후 방법
		for (AnimalInfo i : infoStorage) {
			i.showAnimalInfo();
		}
	}
}