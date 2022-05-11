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
			System.out.println("숫자를 입력해 주세요! ");
			your_num = sc.nextInt();
			if(your_num>=0 && your_num<=100) {
				if(your_num<ran_num) {
					System.out.println("당신의 숫자는 작습니다. 더 큰 숫자를 입력해주세요");
				}else if(your_num>ran_num) {
					System.out.println("당신의 숫자는 큽니다. 더 작은 숫자를 입력해주세요");
				}else {
					System.out.println("*");
					System.out.println("*");
					System.out.println("정답입니다! 시도 횟수 : " + count + "회");
					toggle = false;
				}
			}else {
				System.out.println("잘못된 입력입니다. 0~100 까지의 숫자를 입력해주세여");
			}
			System.out.println("");
		}
		System.out.println("게임이 종료 되었습니다");
	}

}
