package javaOject;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EnumWeekEx2 {
//	static final double PI=3.141592; //����� �޼ҵ� �ۿ��� ���� static
	public static void main(String[] args) {
		
//		double radius = 3.0;
//		double area = radius*radius*PI;
//		System.out.println(area);
//		radius = 5.0;
//		area = radius*radius*PI;
//		System.out.println(area);
		Week today = Week.SUNDAY;
		String name = today.name(); //name() ���� ����� ���ڿ� Ÿ������ ��ȯ
		System.out.println(name);
		int ordinal = today.ordinal(); //ordinal() ���� ����� �ε������� ��ȯ
		System.out.println(ordinal);
		Week day1=Week.MONDAY;
		Week day2=Week.FRIDAY;
		int result1=day1.compareTo(day2); //compareTo() �ε��� ���̰� ��ȯ
		int result2=day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		String day = "FRIDAY";
		Week weekday= Week.valueOf(day);
		if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
			System.out.println("�ָ��̳�");
		}else {
			System.out.println("�����̴Ϥ�");
		}
		
		Week[] days = Week.values();
		for(Week d:days) {
			System.out.println(d.name());
		}
	}

}
