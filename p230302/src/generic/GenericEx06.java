package generic;

class Thing {
	String id;
	String name;

	public Thing() {}
	public Thing(String id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Tv extends Thing {
	@Override
	public String toString() {
		return "나는 새로운 TV이다";
	}
}

class Pen extends Thing {
	@Override
	public String toString() {
		return "나는 평생 사용 가능한 Pen이다";
	}
}

// generic class
// [문법] class 클래스명<타입파라미터> {}
class Box<T> {
	T item;

	public void store(T item) {
		this.item = item;
	}

	public T out() {
		return this.item;
	}
}
// 문제
class Wrap<T> {
	T item;
	
	public void wrap(T item) {
		this.item=item;
	}
	public T unwrap() {
		return this.item;
	}
}
class Animal {}
public class GenericEx06 {
	// generic method
	// [문법] 접근제한자 <타입파라미터> 반환형 메서드명(파라미터) {}

	// 제네릭 타입을 메소드의 파라미터로 사용
	// ?: 와일드카드 (wildcard) => 모든 타입
	public static void openBox(Box<? extends Thing> box) {
		Thing thing = box.out();
		System.out.println(thing.toString());
	}
	
	// [문제] 매개변수: Pen을 포함한 부모의 타입으로 한정(제한)
	public static void unwrapGift(Wrap<? super Pen> wrap) {
		//System.out.println(wrap.unwrap()); 이것만 써도 됨
		
		Object object = wrap.unwrap();
		//Pen pen = (Pen)wrap.unwrap(); 강제 형변환
		System.out.println(object);
	}

	public static void main(String[] args) {
		// Tv를 Box에 담은 후 개봉하시오
		Box<Tv> one = new Box<Tv>();
		one.store(new Tv());
		openBox(one);

		// Pen을 Box에 담은 후 개봉하시오
		Box<Pen> two = new Box<Pen>();
		two.store(new Pen());
		openBox(two);
		
		Box<Animal> three = new Box<Animal>();
		three.store(new Animal());
		//openBox(three); 타입이 안 맞아서 오류
		
		// [문제]
		Wrap<Pen> four = new Wrap<Pen>();
		four.wrap(new Pen());
		unwrapGift(four);
	}
}
