package javaOject;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EnumWeekEx2 {
//	static final double PI=3.141592; //상수는 메소드 밖에서 선언 static
	public static void main(String[] args) {
		
//		double radius = 3.0;
//		double area = radius*radius*PI;
//		System.out.println(area);
//		radius = 5.0;
//		area = radius*radius*PI;
//		System.out.println(area);
		Week today = Week.SUNDAY;
		String name = today.name(); //name() 열거 상수를 문자열 타입으로 반환
		System.out.println(name);
		int ordinal = today.ordinal(); //ordinal() 열거 상수의 인덱스값을 반환
		System.out.println(ordinal);
		Week day1=Week.MONDAY;
		Week day2=Week.FRIDAY;
		int result1=day1.compareTo(day2); //compareTo() 인덱스 차이값 반환
		int result2=day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		String day = "FRIDAY";
		Week weekday= Week.valueOf(day);
		if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
			System.out.println("주말이네");
		}else {
			System.out.println("평일이니ㅔ");
		}
		
		Week[] days = Week.values();
		for(Week d:days) {
			System.out.println(d.name());
		}
	}

}
