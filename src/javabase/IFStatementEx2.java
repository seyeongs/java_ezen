package javabase;

import java.util.Scanner;

public class IFStatementEx2 {

	public static void main(String[] args) {
		/* �ַܼ� ������ �Է¹޾� �Ǹűݾ��� ����ϴ� ���α׷��� �ϼ��Ͻÿ�
		 * ����) ������ 10�� �̻� ���� �� 20% ���ΰ��� ����
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���Լ�����? ");
		int amount = sc.nextInt();
		int price = 2300;
		int result;
		
		if(amount>= 10 && price>=1000) {
			price -= (price/10*2);
			System.out.println("(20% ��������)");
		}
		result = amount * price;
		
		
		System.out.println("�ǸŰ� "+ result+"��");
		

	}

}
