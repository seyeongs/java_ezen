package javabase;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// 문제) 콘솔로 점수를 입력받아
Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 - > ");
		int score = sc.nextInt();
		score /= 10;
		
		switch (score) {
		case 9:
			System.out.println("A등급입니다");
			break;
		case 8:
			System.out.println("b등급입니다");
			break;
		case 7:
			System.out.println("c등급입니다");
			break;
		case 6:
			System.out.println("d등급입니다");
			break;
		default:
			System.out.println("등급입니다");
			
		}
	}

}
