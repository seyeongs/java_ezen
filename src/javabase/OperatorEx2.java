package javabase;

import java.util.Scanner;

public class OperatorEx2 {

	public static void main(String[] args) {
		
		//�ܼ��� ���� ��� �� ������ �Է� �޾� ��ġ���� 1��� ������ �� �� �ִ� ��� ������ ���ϰ� �������� ����Ͻÿ�
		//���� : ��ġ���� 23�����  
		
		//���: ��� �� ������? 00
		//�� �� �� ���� �� �ִ� ��� ������ = 00
		//���� ��� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� ������ �Է����ּ���: ");
		int apple_ea = sc.nextInt();
		
		int child = 23;
		int child_own_apple = apple_ea / child ;
		int apple_left = apple_ea % child;
		
		System.out.println("�� �� �� ���� �� �ִ� ��� ������ = " + child_own_apple);
		System.out.println("���� ��� ������ = " + apple_left);
				
		
		
	}

}
