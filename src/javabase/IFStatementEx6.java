package javabase;

import java.util.Scanner;

public class IFStatementEx6 {

	public static void main(String[] args) {
		// 문제)콘솔로 점수를 입력받아 등급을 계산하는 프로그램을 작성하시오.
		// 등급) 90<= a등급 \ 80<= b \ 70<= c \ 60 d \ else f
		// 실행결과) 점수를 입력해주세요 = >
				   //c등급
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요 - > ");
		int score = sc.nextInt();
		
		if (score>100 || score<0) {
			System.out.println("올바른 값을 입력해주세요");
		}else {
			if(score>=90) {
				if(score>=95) {
					System.out.println("A+등급입니다");
				}else {
					System.out.println("A등급입니다");
				}
			}else if (score>=80) {
				if(score>=85) {
					System.out.println("b+등급입니다");
				}else {
					System.out.println("b등급입니다");
				}
			}else if (score>=70) {
				if(score>75) {
					System.out.println("c+등급입니다");
				}else {
					System.out.println("c등급입니다");
				}
			}else if (score>=60) {
				if(score>=65) {
					System.out.println("d+등급입니다");
				}else {
					System.out.println("d등급입니다");
				}
			}else {
				System.out.println("F등급입니다");
			}
		}
	}
}
