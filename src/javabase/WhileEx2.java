package javabase;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		//��� �ֻ��� ��ȣ �Է�>>3
		//�׷��� ����� ��� �ֱ���
		//������ ����� ���� �ƴϳ׿� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("1~6 ����� �ֻ��� ��ȣ �Է�> ");
		int your_dice = sc.nextInt();
		int ran_dice;
		int count = 0;
		
		while(true) {
			count++;
			ran_dice = (int)(Math.random()*6)+1;
			System.out.println(ran_dice);
			if (your_dice<7 && your_dice>0) {
				
				if(ran_dice == your_dice && count<=6) {
					System.out.println("������ ���� ������!!");
					break;
				}else if(ran_dice == your_dice){
					System.out.println("������ ���� ���� �ʽ��ϴ� �����ϼ���");
					break;
				}
			}else {
				System.out.println("�߸��� �Է��Դϴ�. 1~6 ������ ���ڸ� �Է����ּ���");
				your_dice = sc.nextInt();
				count = 0;
			}
		}

	}

}
