package javaOject;

import java.util.Scanner;

public class ConfirmEx3 {

	public static void main(String[] args) {
		boolean run = true;
		int student = 0;
		int[] scores =null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("����> ");
			
			int selectNo = sc.nextInt();
			
			switch(selectNo) {
			
			case 1:
				System.out.print("�л���> ");
				student = sc.nextInt();
				scores = new int [student];
				break;
				
			case 2:
				for(int i = 0; i<scores.length; i++) {
					System.out.print("scores[" + i +"]> ");
					scores[i] = sc.nextInt();
				}
				break;
				
			case 3:
				for(int i = 0; i<scores.length; i++) {
					
					System.out.println("scores[" + i +"]: " + scores[i]);
				}
				break;
				
			case 4:
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				
				for(int score:scores) {
					if(max<score) {
						max = score;
					}
					sum += score;
				}
				avg = (double)sum/scores.length;
				System.out.println("�ְ� ����: " + max );
				System.out.println("��� ����: " + avg);
				break;
				
			case 5:
				System.out.println("���α׷� ����");
				run = false;
				break;
			}
				
			
		}

	}

}
