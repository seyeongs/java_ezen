package javaClass;

import java.rmi.AccessException;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			int num1 =10;
			int num2 =0;
			int result = num1/num2;
			System.out.println("���=" + result);
		}catch(ArithmeticException e) { //����ó�� �ڵ带 �μ��� �Ѱ���� �Ѵ�
			System.out.println("0���� ���� �� ����");
			
		}
	}

}
