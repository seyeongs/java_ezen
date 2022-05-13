package javaAPI;

import java.text.DecimalFormat;

public class NumberFormatEx1 {

	public static void main(String[] args) {
		
		double dnum = 5123.23324;
		DecimalFormat df = new DecimalFormat("0.00"); //0�ڸ��� ������ 0�� ����
		System.out.println(df.format(dnum)); //�Ҽ��� �ڸ� ���� format �ݿø� �ڵ����� ���ش�
		
		df = new DecimalFormat("#, ###��"); //#�ڸ��� ������ �ƹ��͵� �� ����
		int num = 756000000;
		System.out.println(df.format(num));
		
		double dnum2 = 0.123;
		df = new DecimalFormat("0.0%");
		System.out.println(df.format(dnum2));
		
	}

}
