package javabase;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
//		switch(변수){
//			case 값:
//				명령문;
//				break;
//			case 값:
//				명령문;			
//				break;
//			case 값:
//				명령문;			
//				break;
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("여행지를 선택(1. 미주 2. 유럽 3. 동남아)");
		int choice = sc.nextInt();
		switch (choice) {
			case 1:
				System.out.println("1층 데스크로 가세요");
				break;
			case 2:
				System.out.println("2층 데스크로 가세요");
				break;
			case 3:
				System.out.println("별관 데스크로 가세요");
				break;
			default: //맞는 케이스가 없을 땐 디폴트 실행
				System.out.println("여행지 선택이 잘못되었소");
		}
	}

}
