package javaAPI;

import java.util.Arrays;
import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		//Math Ŭ������ random()�޼ҵ�
		//double num = Math.random(); //0.0 ~ 1.0 ������ �Ҽ� ������ ������ ��ȯ
//		double num = (int)(Math.random()*6)+1; //0 ~ 6 ������ ���� ������ ��ȯ
//		System.out.println(num);
		
		//RandomŬ����
		Random rand = new Random();
		Random rand1 = new Random(7); //������ ���ڷ� ���޵� ���ڰ��� ���� ������ ���õȴ�
		
		Random rand2;
		rand2 = new Random(5);//////////////////////////////////////���ڰ� ����
		int[] lotto = new int[6];
		int[] myNum = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
//			System.out.println(rand.nextInt(10)); // 0~9
//			System.out.println(rand.nextInt(10)+1); // 1~10
			lotto[i] = rand2.nextInt(45)+1;
			System.out.println(lotto[i]);
		}
		System.out.println("-------------------------------");
		rand2 = new Random(5);///////////////////////////////////////���ڰ� ����
		for(int i=0; i<myNum.length; i++) {
			myNum[i] = rand2.nextInt(45)+1;
			System.out.println(myNum[i]);
		}
		Arrays.sort(lotto);
		Arrays.sort(myNum);
		boolean result = Arrays.equals(lotto, myNum); //.equals�޼ҵ�� ��� �迭�� sort�Ǿ� �־�� �Ѵ�
		System.out.println(result);
	}

}
