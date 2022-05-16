package javaAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataPrintEx1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat simpD = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		System.out.println(simpD.format(date));
		
	}

}
