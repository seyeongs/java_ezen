package javaAPI;

import java.util.Arrays;
import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		//Math 클래스의 random()메소드
		//double num = Math.random(); //0.0 ~ 1.0 사이의 소수 형태의 난수값 반환
//		double num = (int)(Math.random()*6)+1; //0 ~ 6 사이의 정수 난수값 반환
//		System.out.println(num);
		
		//Random클래스
		Random rand = new Random();
		Random rand1 = new Random(7); //생성자 인자로 전달된 종자값에 따라 난수가 셋팅된다
		
		Random rand2;
		rand2 = new Random(5);//////////////////////////////////////종자값 설정
		int[] lotto = new int[6];
		int[] myNum = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
//			System.out.println(rand.nextInt(10)); // 0~9
//			System.out.println(rand.nextInt(10)+1); // 1~10
			lotto[i] = rand2.nextInt(45)+1;
			System.out.println(lotto[i]);
		}
		System.out.println("-------------------------------");
		rand2 = new Random(5);///////////////////////////////////////종자값 설정
		for(int i=0; i<myNum.length; i++) {
			myNum[i] = rand2.nextInt(45)+1;
			System.out.println(myNum[i]);
		}
		Arrays.sort(lotto);
		Arrays.sort(myNum);
		boolean result = Arrays.equals(lotto, myNum); //.equals메소드는 대상 배열이 sort되어 있어야 한다
		System.out.println(result);
	}

}
