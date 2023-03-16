/*
 * [상속 관계]
 * << IS-A 관계 >>
 * : ~는 ~다라고 표현 가능
 * : ex) 학생(자식)은 사람(부모)이다. 
 * 
 * << HAS-A 관계 >> 소유 관계, 포함 관계
 * : ~는 ~를 소유(포함)하고 있다.
 * : ex) 폰(자식)은 카메라(부모)를 포함하고 있다.
 * 
 */
class Gun {
	int bullet;

	public Gun(int bnum) {
		bullet = bnum;
	}

	public void shoot() {
		System.out.println("BBANG!");
		bullet--;
	}
}

//class Police extends Gun {
//	int handcuffs;
//
//	public Police(int bnum, int bcuff) {
//		super(bnum); // 명시적 생성자 호출 (매개변수가 있는 생성자를 호출하고 싶어서)
//		handcuffs = bcuff;
//	}
//	public void putHandcuff() {
//		System.out.println("SNAP!");
//		handcuffs--;
//	}
//}

// 상속은 아니고 객체가 안에 있는 다른 객체를 관리하는 형태 (참조변수를 멤버변수로 가져 상속과 같은 효과를 줌) => containment
class Police {
	int handcuffs;
	Gun pistol;

	public Police(int bnum, int bcuff) {
		handcuffs = bcuff;
		if (bnum != 0)
			pistol = new Gun(bnum);
		else
			pistol = null;
	}

	public void putHandcuff() {
		System.out.println("SNAP!");
		handcuffs--;
	}

	public void shoot() {
		if (pistol == null)
			System.out.println("Hut BBANG!");
		else
			pistol.shoot();
	}
}

public class InheritanceEx04 {
	public static void main(String[] args) {
		Police pman = new Police(5, 3);
		pman.shoot();
		pman.putHandcuff();
	}
}
