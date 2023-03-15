//import java.util.Scanner;
import book.BookManager;

/*
 * AnimalBook: if -> switch 
 * BookManager: 향상된 for문
 * AnimalBook, BookManager: Scanner 객체 하나만 생성
 * 
 */

public class AnimalBook {
	private static BookManager manager = new BookManager();

	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		menu:
		while (true) {
			System.out.print("정보를 입력할까요? (Y/N) ");
			String inf = BookManager.input.next();
			// [방법 1 if문]
//			if (inf.equals("y") || inf.equals("Y") || inf.equals("yes") || inf.equals("Yes") || inf.equals("YES")) {
//				manager.inputData();
//			} else if (inf.equals("n") || inf.equals("N") || inf.equals("no") || inf.equals("No") ||inf.equals("NO")) {
//				System.out.println("정보 입력을 종료합니다.");
//				break;
//			} else {
//				System.out.println("(Y/N) 둘 중 하나를 입력하세요.\n");
//			}
			// [방법 2 switch문]
			switch (inf) {
			case "y": case "Y": case "yes": case "Yes": case "YES":
				manager.inputData();
				break;
			case "n": case "N": case "no": case "No": case "NO":
				System.out.println("정보 입력을 종료합니다.\n");
				break menu;
			default:
				System.out.println("(Y/N) 둘 중 하나를 입력하세요.\n");
			}
		}
		System.out.println("<< 저장 목록 >>");
		manager.showBook();
		BookManager.input.close();
	}
}