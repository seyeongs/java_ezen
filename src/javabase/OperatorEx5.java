package javabase;

import java.util.Scanner;

public class OperatorEx5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int man_won=0;
		int ocheon_won=0;
		int cheon_won=0;
		int obec_won=0;
		int bec_won=0;
		int sib_won=0;
		
		//�ݾ��Է¹ޱ�
		System.out.print("�ݾ��Է� >> ");
		int cash = sc.nextInt();
		
		//����
		man_won = cash/10000;
		System.out.println("���� = > " +man_won+"��");
		cash -= man_won*10000;
		
		//��õ��
		if(cash>=5000) {
			ocheon_won = cash/5000;
			System.out.println("��õ�� = > " +ocheon_won+"��");
			cash -= ocheon_won*5000;
		} else {System.out.println("��õ�� = > " +ocheon_won+"��");}
		
		//õ��
		cheon_won = cash/1000;
		System.out.println("õ�� = > " +cheon_won+"��");
		cash -= cheon_won*1000;
		
		//�����
		if(cash>=500) {
			obec_won = cash/500;
			System.out.println("����� = > " +obec_won+"��");
			cash -= obec_won*500;
		}else {System.out.println("����� = > " +obec_won+"��");}
		
		//���
		bec_won = cash/100;
		System.out.println("��� = > " +bec_won+"��");
		cash -= bec_won*100;
		
		//�ʿ�
		sib_won = cash/10;
		System.out.println("�ʿ� = > " +sib_won+"��");
		cash -= sib_won*10;
		
		//�ܾ�ǥ��
//		System.out.println("�� = > " +cash);

	}

}
