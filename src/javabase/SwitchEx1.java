package javabase;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
//		switch(����){
//			case ��:
//				��ɹ�;
//				break;
//			case ��:
//				��ɹ�;			
//				break;
//			case ��:
//				��ɹ�;			
//				break;
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ����(1. ���� 2. ���� 3. ������)");
		int choice = sc.nextInt();
		switch (choice) {
			case 1:
				System.out.println("1�� ����ũ�� ������");
				break;
			case 2:
				System.out.println("2�� ����ũ�� ������");
				break;
			case 3:
				System.out.println("���� ����ũ�� ������");
				break;
			default: //�´� ���̽��� ���� �� ����Ʈ ����
				System.out.println("������ ������ �߸��Ǿ���");
		}
	}

}
