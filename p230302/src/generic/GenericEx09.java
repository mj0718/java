package generic;

// 제네릭 배열 생성은 불가능
class Cool<T> {
	T count;
	
	//T[] array = new T[10]; Error
	public Cool() {}
	public Cool(T count) {
		this.count = count;
	}
	
}

public class GenericEx09 {
	public static void main(String[] args) {
		//Cool<String> cool = new Cool<String>(); Error
		//Cool<Object> cool = new Cool<String>();
		
	}
}
