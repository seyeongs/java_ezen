package javabase;

import java.util.Scanner;

public class OperatorEx4 {

	public static void main(String[] args) {
		int num = 10; 
		num += 20;
		System.out.println(num);
		
		//
		Scanner sc = new Scanner(System.in);
		System.out.print("구입수량: ");
		int amount = sc.nextInt();
		int price = 1000;
		String memo = "(정상가)";
		
		if(amount>=10) {
			price = 800;
			memo = "(할인가)";
		}
		
		int salesPrice = amount*price;
		System.out.println("총 판매가는 " + salesPrice + "원입니다. " + memo);
	}
}
