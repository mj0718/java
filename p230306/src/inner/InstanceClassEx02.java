package inner;

interface Yahoo {
	public void showNum();
}

class OuterTwo {
	
	public Inner getInner(int num) {
		return new Inner(num);
	}
	
	private class Inner implements Yahoo{
		int num;

		Inner(int num) {
			this.num = num;
			System.out.println("[Inner class] 생성자 실행됨");
		}

		public void showNum() {
			System.out.println("[Inner class] num >> " + this.num);
		}
	}
}

public class InstanceClassEx02 {
	public static void main(String[] args) {
		
//		OuterTwo outer =new OuterTwo();
//		OuterTwo.Inner inner = outer.new Inner(5);
//		inner.showNum();
		
		OuterTwo outer = new OuterTwo();
		Yahoo yahoo = outer.getInner(7);
		yahoo.showNum();
		
	}
}
