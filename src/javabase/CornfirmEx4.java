package javabase;

import java.util.Scanner;

public class CornfirmEx4 {

	public static void main(String[] args) {
		boolean run =true;
		
		int balance = 0;
		
		int choice;
		int your_data;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			System.out.print("����> ");
			
			choice = sc.nextInt();
			if(choice == 1) {
				
				System.out.print("���ݾ�>");
				your_data = sc.nextInt();
				balance += your_data;
			}else if(choice == 2) {
				
				System.out.print("��ݾ�>");
				your_data = sc.nextInt();
				balance -= your_data;
			}else if(choice == 3) {
				
				System.out.println("�ܰ�>"+balance);
		
			}else if(choice == 4) {
				System.out.println("���α׷� ����");
				run = false;
				
			}
			
		}

	}

}
