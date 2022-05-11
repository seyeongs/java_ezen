package javabase;

import java.util.Scanner;

public class OperatorEx5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int man_won=0;
		int ocheon_won=0;
		int cheon_won=0;
		int obec_won=0;
		int bec_won=0;
		int sib_won=0;
		
		//금액입력받기
		System.out.print("금액입력 >> ");
		int cash = sc.nextInt();
		
		//만원
		man_won = cash/10000;
		System.out.println("만원 = > " +man_won+"장");
		cash -= man_won*10000;
		
		//오천원
		if(cash>=5000) {
			ocheon_won = cash/5000;
			System.out.println("오천원 = > " +ocheon_won+"장");
			cash -= ocheon_won*5000;
		} else {System.out.println("오천원 = > " +ocheon_won+"장");}
		
		//천원
		cheon_won = cash/1000;
		System.out.println("천원 = > " +cheon_won+"장");
		cash -= cheon_won*1000;
		
		//오백원
		if(cash>=500) {
			obec_won = cash/500;
			System.out.println("오백원 = > " +obec_won+"개");
			cash -= obec_won*500;
		}else {System.out.println("오백원 = > " +obec_won+"개");}
		
		//백원
		bec_won = cash/100;
		System.out.println("백원 = > " +bec_won+"개");
		cash -= bec_won*100;
		
		//십원
		sib_won = cash/10;
		System.out.println("십원 = > " +sib_won+"개");
		cash -= sib_won*10;
		
		//잔액표시
//		System.out.println("원 = > " +cash);

	}

}
