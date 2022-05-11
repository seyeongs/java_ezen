package javaOject;

import java.util.Scanner;

public class ConfirmEx3 {

	public static void main(String[] args) {
		boolean run = true;
		int student = 0;
		int[] scores =null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			switch(selectNo) {
			
			case 1:
				System.out.print("학생수> ");
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
				System.out.println("최고 점수: " + max );
				System.out.println("평균 점수: " + avg);
				break;
				
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
			}
				
			
		}

	}

}
