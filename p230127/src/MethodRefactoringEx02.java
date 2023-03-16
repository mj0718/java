import java.util.Scanner;

public class MethodRefactoringEx02 {

	public static void main(String[] args) {

		int num = 5;
		increment(num);

		Scanner input = new Scanner(System.in);
		int userNum = input.nextInt();
		
		increment(userNum);
		
		int var = 10;
		
		increment(var);
		
		input.close();
	}

	public static void increment(int arg) {
		arg++;
		System.out.println(arg);
	}
}
