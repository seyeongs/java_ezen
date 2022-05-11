package javabase;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		//행운 주사위 번호 입력>>3
		//그래도 행운은 살아 있군요
		//오늘은 행운의 날이 아니네요 ㅜ
		Scanner sc = new Scanner(System.in);
		System.out.print("1~6 행운의 주사위 번호 입력> ");
		int your_dice = sc.nextInt();
		int ran_dice;
		int count = 0;
		
		while(true) {
			count++;
			ran_dice = (int)(Math.random()*6)+1;
			System.out.println(ran_dice);
			if (your_dice<7 && your_dice>0) {
				
				if(ran_dice == your_dice && count<=6) {
					System.out.println("오늘은 운이 좋군요!!");
					break;
				}else if(ran_dice == your_dice){
					System.out.println("오늘은 운이 좋지 않습니다 조심하세요");
					break;
				}
			}else {
				System.out.println("잘못된 입력입니다. 1~6 사이의 숫자를 입력해주세요");
				your_dice = sc.nextInt();
				count = 0;
			}
		}

	}

}
