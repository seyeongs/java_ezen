package javaAPI;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx1 {

	public static void main(String[] args) {
//		TimeZone tz = TimeZone.getTimeZone("Europe/Paris");
//		Calendar cal = Calendar.getInstance(tz); //타임존 객체를 넘겨주면 시간날짜 정보가 바뀐다
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);//스위치문 필요
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		int ampm = cal.get(Calendar.AM_PM); //0오전 1오후
		String strAmpm;
		if (ampm==0) {
			strAmpm = "오전 ";
		}else {
			strAmpm = "오후 ";
		}
		System.out.println(year+"년 "+month+"월 "+day+"일 "+strAmpm+hour+"시 "+min+"분 "+sec+"초");
		//Calendar 클래스는 값을 반환하기 때문에 이른 변수에 저장해서 연산에 활용할 수 있다
		
	}

}
