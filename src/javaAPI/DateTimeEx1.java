package javaAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeEx1 { //자바8이후 생김

	public static void main(String[] args) {
		//LocalDate는 날짜와 관련된 클래스
		LocalDate curDate = LocalDate.now(); //날짜만 가져옴
		System.out.println("오늘 : "+curDate); //정해진 형식이 정해져 있다
		LocalDate endDate = LocalDate.of(2022, 12, 5);
		System.out.println("수료 : " +endDate);
		
		int y =curDate.getYear(); //부분 별로 따로 값을 가져올 수도 있다
		int m =curDate.getMonthValue();
		int d = curDate.getDayOfMonth();
		if(curDate.isLeapYear()) { //평년, 윤년
			System.out.println("올해는 윤년 2월 29까지 있습");
		}else {
			System.out.println("올해는 평년 2월 28일까지 있음");
		}
		
		
		//LocalTime는 시간과 관련된 클래스
		LocalTime curTime = LocalTime.now();
		System.out.println("현재시각 : "+curTime);
		LocalTime endTime = LocalTime.of(21, 40);
		System.out.println("수업종료 시간 "+endTime);
		
		int h = curTime.getHour(); //부분 별로 따로 값을 가져올 수도 있다
		int mm = curTime.getMinute();
		int sec = curTime.getSecond();
		
		//날짜와 시간 한 번에 가져오는 클래스 LOLOLO
		LocalDateTime curDT =LocalDateTime.now();
		System.out.println(curDT);
		LocalDateTime endDT = LocalDateTime.of(2022, 12,5,21,40);
		System.out.println(endDT);
		ZonedDateTime zDateTime = ZonedDateTime.now(ZoneId.of("Japan"));
		System.out.println(zDateTime);
	}

}
