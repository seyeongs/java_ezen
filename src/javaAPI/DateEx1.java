package javaAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		
		
		//Date형식 커스텀하기
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh:mm:ss"); //HH=24시간 hh=12시간오전오후 a=오전or오후 E=요일
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("yyyy년 D일 경과"); //D=올해 기준 몇 일 째인지
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("yyyy년 w주 경과"); //w=올해 기준 몆 주 째인지
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("MM월 dd일 W주차"); //W=현월 기준 몆 주 째인지
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("hh시 m분 S초"); //S = 천분의 1초 단위(ms)
		System.out.println(sdf.format(date));
	}

}
