package javaAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeEx1 { //�ڹ�8���� ����

	public static void main(String[] args) {
		//LocalDate�� ��¥�� ���õ� Ŭ����
		LocalDate curDate = LocalDate.now(); //��¥�� ������
		System.out.println("���� : "+curDate); //������ ������ ������ �ִ�
		LocalDate endDate = LocalDate.of(2022, 12, 5);
		System.out.println("���� : " +endDate);
		
		int y =curDate.getYear(); //�κ� ���� ���� ���� ������ ���� �ִ�
		int m =curDate.getMonthValue();
		int d = curDate.getDayOfMonth();
		if(curDate.isLeapYear()) { //���, ����
			System.out.println("���ش� ���� 2�� 29���� �ֽ�");
		}else {
			System.out.println("���ش� ��� 2�� 28�ϱ��� ����");
		}
		
		
		//LocalTime�� �ð��� ���õ� Ŭ����
		LocalTime curTime = LocalTime.now();
		System.out.println("����ð� : "+curTime);
		LocalTime endTime = LocalTime.of(21, 40);
		System.out.println("�������� �ð� "+endTime);
		
		int h = curTime.getHour(); //�κ� ���� ���� ���� ������ ���� �ִ�
		int mm = curTime.getMinute();
		int sec = curTime.getSecond();
		
		//��¥�� �ð� �� ���� �������� Ŭ���� LOLOLO
		LocalDateTime curDT =LocalDateTime.now();
		System.out.println(curDT);
		LocalDateTime endDT = LocalDateTime.of(2022, 12,5,21,40);
		System.out.println(endDT);
		ZonedDateTime zDateTime = ZonedDateTime.now(ZoneId.of("Japan"));
		System.out.println(zDateTime);
	}

}
