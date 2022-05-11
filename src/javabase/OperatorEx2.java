package javabase;

import java.util.Scanner;

public class OperatorEx2 {

	public static void main(String[] args) {
		
		//콘솔을 통해 사과 총 갯수를 입력 받아 유치원생 1명당 나누어 줄 수 있는 사과 개수를 구하고 나머지도 출력하시오
		//조건 : 유치원생 23명고정  
		
		//결과: 사과 총 개수는? 00
		//한 명 당 가질 수 있는 사과 개수는 = 00
		//남은 사과 갯수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과 갯수를 입력해주세요: ");
		int apple_ea = sc.nextInt();
		
		int child = 23;
		int child_own_apple = apple_ea / child ;
		int apple_left = apple_ea % child;
		
		System.out.println("한 명 당 가질 수 있는 사과 개수는 = " + child_own_apple);
		System.out.println("남은 사과 개수는 = " + apple_left);
				
		
		
	}

}
