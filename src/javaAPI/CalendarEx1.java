package javaAPI;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx1 {

	public static void main(String[] args) {
//		TimeZone tz = TimeZone.getTimeZone("Europe/Paris");
//		Calendar cal = Calendar.getInstance(tz); //Ÿ���� ��ü�� �Ѱ��ָ� �ð���¥ ������ �ٲ��
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);//����ġ�� �ʿ�
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		int ampm = cal.get(Calendar.AM_PM); //0���� 1����
		String strAmpm;
		if (ampm==0) {
			strAmpm = "���� ";
		}else {
			strAmpm = "���� ";
		}
		System.out.println(year+"�� "+month+"�� "+day+"�� "+strAmpm+hour+"�� "+min+"�� "+sec+"��");
		//Calendar Ŭ������ ���� ��ȯ�ϱ� ������ �̸� ������ �����ؼ� ���꿡 Ȱ���� �� �ִ�
		
	}

}
