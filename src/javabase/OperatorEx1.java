package javabase;

import java.util.Scanner;

public class OperatorEx1 {

	public static void main(String[] args) {
		//double num  = 5/2.0; //�Ǽ� ���� ���Ϸ��� ����ܰ迡�� �Ǽ�ȭ ���Ѿ� �Ѵ�
			
		int amount = 5;
		int price = 2000;
		int salesPrice = amount*price;
		//System.out.println("�� �ǸŰ���= " + salesPrice);
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� :");
		amount = sc.nextInt();
		
		System.out.print("������ �Է����ּ��� :");
		price = sc.nextInt();
		
		salesPrice = amount*price;
		System.out.println("�� �ǸŰ���= " + salesPrice + "���Դϴ�.");
	}

}
