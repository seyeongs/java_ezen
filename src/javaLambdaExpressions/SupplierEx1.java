package javaLambdaExpressions;

import java.util.function.IntSupplier;

//�Լ��� �������̽� Consumer, Supplier, Function ... 
public class SupplierEx1 {

	public static void main(String[] args) {
		IntSupplier supplier = ()->{ //�Ű����� ���� ���ϰ��� �ִ�
			int num = (int)(Math.random()*6)+1;
			return num;
		};
		
		System.out.println("�ֻ��� " + supplier.getAsInt());

	}

}
