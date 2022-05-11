package javabase;

import java.util.Scanner;

public class IFStatementEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이는 ? ");
		int age = sc.nextInt();
		if(19<age && age<30) {
			System.out.println("상품가입이 가능햅니데");
		} else {
			System.out.println("가입할 수 없는 상품입니다");
		}
	}

}
