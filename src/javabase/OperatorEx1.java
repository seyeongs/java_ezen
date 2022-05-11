package javabase;

import java.util.Scanner;

public class OperatorEx1 {

	public static void main(String[] args) {
		//double num  = 5/2.0; //실수 몫을 구하려면 연산단계에서 실수화 시켜야 한다
			
		int amount = 5;
		int price = 2000;
		int salesPrice = amount*price;
		//System.out.println("총 판매가는= " + salesPrice);
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수량을 입력해주세요 :");
		amount = sc.nextInt();
		
		System.out.print("가격을 입력해주세요 :");
		price = sc.nextInt();
		
		salesPrice = amount*price;
		System.out.println("총 판매가는= " + salesPrice + "원입니다.");
	}

}
