// stack 메모리 구조를 구현하시오.

class ArrayStack {
	int[] arr;
	int top = -1;

	int peek() {
		return arr[top];
	}
//	// [정답]
//	final int SIZE = arr.length-1;
//	
////	void setArr(int length) {
////		this.arr = new int[length];
////	}
//	public ArrayStack() {
//		this.arr=new int[SIZE+1];
//	}
//	void push(int element) {
////		if (top < SIZE) {
////			arr[++top] = element;
////		} else {
////			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
////		}
//		
//		if (top < SIZE) {
//			arr[++top] = element;
//			return;
//		} 
//		System.out.println("스택이 꽉 찼습니다! 용량 초과!");
//	}
//	
//	int pop() {
//		if (top > -1)
//			return arr[top--];
//		else
//			System.out.println("스택이 비었습니다!");
//			return top;
//	}

	// [내 답안]
	void setArr(int size) {
		arr = new int[size];
	}

	void push(int num) {
		if (top >= arr.length - 1)
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		else {
//			arr[top + 1] = num;
//			System.out.println("Inserted Item : " + arr[top + 1]);
//			top++; 코드 단축 가능
			arr[++top] = num;
			System.out.println("Inserted Item : " + arr[top]);
		}
	}

	int pop() {
		if (top <= -1) {
			System.out.println("스택이 비었습니다!");
			return -1;
		}
		return arr[top--];
	}
}

public class Quiz03 {
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack();

		stack.setArr(5);

		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);

		System.out.println("\ntop에 있는 아이템 출력 : " + stack.peek());

		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());

	}
}
