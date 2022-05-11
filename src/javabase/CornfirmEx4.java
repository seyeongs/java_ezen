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
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			
			choice = sc.nextInt();
			if(choice == 1) {
				
				System.out.print("예금액>");
				your_data = sc.nextInt();
				balance += your_data;
			}else if(choice == 2) {
				
				System.out.print("출금액>");
				your_data = sc.nextInt();
				balance -= your_data;
			}else if(choice == 3) {
				
				System.out.println("잔고>"+balance);
		
			}else if(choice == 4) {
				System.out.println("프로그램 종료");
				run = false;
				
			}
			
		}

	}

}
