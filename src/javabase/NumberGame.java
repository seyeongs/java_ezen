package javabase;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		int ran_num = (int)(Math.random()*100)+1;
		int your_num;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		boolean toggle = true;
		
		while(toggle) {
			count++;
			System.out.println("���ڸ� �Է��� �ּ���! ");
			your_num = sc.nextInt();
			if(your_num>=0 && your_num<=100) {
				if(your_num<ran_num) {
					System.out.println("����� ���ڴ� �۽��ϴ�. �� ū ���ڸ� �Է����ּ���");
				}else if(your_num>ran_num) {
					System.out.println("����� ���ڴ� Ů�ϴ�. �� ���� ���ڸ� �Է����ּ���");
				}else {
					System.out.println("*");
					System.out.println("*");
					System.out.println("�����Դϴ�! �õ� Ƚ�� : " + count + "ȸ");
					toggle = false;
				}
			}else {
				System.out.println("�߸��� �Է��Դϴ�. 0~100 ������ ���ڸ� �Է����ּ���");
			}
			System.out.println("");
		}
		System.out.println("������ ���� �Ǿ����ϴ�");
	}

}
