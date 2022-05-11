package javabase;

import java.util.Scanner;

public class IFStatementEx2 {

	public static void main(String[] args) {
		/* 콘솔로 수량을 입력받아 판매금액을 계산하는 프로그램을 완성하시오
		 * 조건) 수량을 10개 이상 구입 시 20% 할인가를 적용
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("구입수량은? ");
		int amount = sc.nextInt();
		int price = 2300;
		int result;
		
		if(amount>= 10 && price>=1000) {
			price -= (price/10*2);
			System.out.println("(20% 할인적용)");
		}
		result = amount * price;
		
		
		System.out.println("판매가 "+ result+"원");
		

	}

}
