package javabase;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// ����) �ַܼ� ������ �Է¹޾�
Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� - > ");
		int score = sc.nextInt();
		score /= 10;
		
		switch (score) {
		case 9:
			System.out.println("A����Դϴ�");
			break;
		case 8:
			System.out.println("b����Դϴ�");
			break;
		case 7:
			System.out.println("c����Դϴ�");
			break;
		case 6:
			System.out.println("d����Դϴ�");
			break;
		default:
			System.out.println("����Դϴ�");
			
		}
	}

}
