package javabase;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���αױ׷��� �����Ϸ��� q�� �Է��ϼ���");
		String  input;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("�Է³���>>>...");
			input = sc.nextLine();
			System.out.println(input);
		}while(!input.equals("q"));
			System.out.println("���α׷� ����");
			
	}

}
