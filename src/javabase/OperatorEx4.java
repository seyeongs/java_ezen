package javabase;

import java.util.Scanner;

public class OperatorEx4 {

	public static void main(String[] args) {
		int num = 10; 
		num += 20;
		System.out.println(num);
		
		//
		Scanner sc = new Scanner(System.in);
		System.out.print("���Լ���: ");
		int amount = sc.nextInt();
		int price = 1000;
		String memo = "(����)";
		
		if(amount>=10) {
			price = 800;
			memo = "(���ΰ�)";
		}
		
		int salesPrice = amount*price;
		System.out.println("�� �ǸŰ��� " + salesPrice + "���Դϴ�. " + memo);
	}
}
