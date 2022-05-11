package javabase;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 원하는 단수를 입력해주세요 = >");
		int num2 = sc.nextInt();
		System.out.println("** " + num2 + "단 **");
		int result;
		for(int i = 1; i<=9; i++) {
			result = num2*i;
			System.out.println(num2 + "X" + i + "=" + result);
		}

	}

}
