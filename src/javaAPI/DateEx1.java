package javaAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		
		
		//Date���� Ŀ�����ϱ�
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� a hh:mm:ss"); //HH=24�ð� hh=12�ð��������� a=����or���� E=����
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("yyyy�� D�� ���"); //D=���� ���� �� �� °����
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("yyyy�� w�� ���"); //w=���� ���� �p �� °����
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("MM�� dd�� W����"); //W=���� ���� �p �� °����
		System.out.println(sdf.format(date));
		sdf = new SimpleDateFormat("hh�� m�� S��"); //S = õ���� 1�� ����(ms)
		System.out.println(sdf.format(date));
	}

}
