package javaOject;

import java.util.Calendar;

public class EnumWeekEx1 {

	public static void main(String[] args) {
//		Week today = null;
//		Calendar cal = Calendar.getInstance();
//		int y = cal.get(Calendar.YEAR);
//		int w = cal.get(Calendar.DAY_OF_WEEK);
		Week today = null;
		Calendar cal = Calendar.getInstance(); //getInstance(); �ν��Ͻ� ���� ��� ����
		int y = cal.get(Calendar.YEAR);
		int w = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(w) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
			
		}
		
		
		System.out.println(today);
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ����̴� ������ ������");
		}else {
			System.out.println("�����ϼ���~");
		}

	}

}