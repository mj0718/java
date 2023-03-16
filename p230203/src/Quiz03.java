// stack 메모리 구조를 구현하시오.

class ArrayStack {
	int[] arr;
	int top = -1;

	int peek() {
		return arr[top];
	}

//	final int SIZE = arr.length-1;
	final int SIZE;

//	void setArr(int length) {
////		this.arr = new int[length];
//	}

	public ArrayStack(int size) {
		this.SIZE = size;
		arr = new int[SIZE];
	}

	void push(int element) {
//		if (top < SIZE) {
//			arr[++top] = element;
//		} else {
//			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
//		}
//		
		if (top < SIZE - 1) {
			arr[++top] = element;
			return;
		}
		System.out.println("스택이 꽉 찼습니다! 용량 초과!");
	}

	int pop() {
		if (top > -1)
			return arr[top--];
		else
			System.out.println("스택이 비었습니다!");
		return top;
	}
}

public class Quiz03 {
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(5);

//		stack.setArr(5);

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
