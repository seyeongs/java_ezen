package javaAPI;

import java.text.DecimalFormat;

public class NumberFormatEx1 {

	public static void main(String[] args) {
		
		double dnum = 5123.23324;
		DecimalFormat df = new DecimalFormat("0.00"); //0자리가 남으면 0이 찍힘
		System.out.println(df.format(dnum)); //소수점 자릿 수를 format 반올림 자동으로 해준다
		
		df = new DecimalFormat("#, ###원"); //#자리가 남으면 아무것도 안 찍힘
		int num = 756000000;
		System.out.println(df.format(num));
		
		double dnum2 = 0.123;
		df = new DecimalFormat("0.0%");
		System.out.println(df.format(dnum2));
		
	}

}
