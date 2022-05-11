package javabase;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그그램을 종료하려면 q를 입력하세요");
		String  input;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("입력내용>>>...");
			input = sc.nextLine();
			System.out.println(input);
		}while(!input.equals("q"));
			System.out.println("프로그램 종료");
			
	}

}
