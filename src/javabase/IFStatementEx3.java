package javabase;

import java.util.Scanner;

public class IFStatementEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���̴� ? ");
		int age = sc.nextInt();
		if(19<age && age<30) {
			System.out.println("��ǰ������ �����ݴϵ�");
		} else {
			System.out.println("������ �� ���� ��ǰ�Դϴ�");
		}
	}

}
