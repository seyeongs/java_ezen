package javaAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataPrintEx1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat simpD = new SimpleDateFormat("yyyy�� MM�� dd�� a hh�� mm�� ss��");
		System.out.println(simpD.format(date));
		
	}

}
