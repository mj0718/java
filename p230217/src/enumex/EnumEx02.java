package enumex;

import java.util.Scanner;

interface Week {
	// field : public static final
	int MON =1, TUE=2, WED=3, THU=4, FRI=5, SAT=6, SUN=7;
	
}

public class EnumEx02 {
	public static void main(String[] args) {
		System.out.println(Week.MON);
		System.out.println("오늘의 요일을 선택하세요...");
		System.out.println("1.월, 2.화, 3.수, 4.목, 5.금, 6.토, 7.일");
		
		Scanner input = new Scanner(System.in);
		int week = input.nextInt();
		
		switch(week) {
		case Week.MON:
			System.out.println("주간 회의");
			break;
		case Week.TUE:
			System.out.println("프로젝트 기획 회의");
			break;
		case Week.WED:
			System.out.println("진행 사항 보고");
			break;
		case Week.THU:
			System.out.println("사내 축구 시합");
			break;
		case Week.FRI:
			System.out.println("프로젝트 마감");
			break;
		case Week.SAT:
			System.out.println("가족과 즐거운 시간");
			break;
		case Week.SUN:
			System.out.println("휴일입니다.");
		}
		input.close();
	}
}
