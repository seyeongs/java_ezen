package javaAPI;

import java.util.Arrays;

public class ArraysEx2 {

	public static void main(String[] args) {
		int[] scores = {95,90,80,30,40,50};
		
		Arrays.sort(scores);
		for(int score : scores) {
			System.out.println(score);
		}
		int index = Arrays.binarySearch(scores, 90);
		
		System.out.println("ã�� �ε��� ��ġ : " + index); //Arrays.binarySearch() �޼ҵ�� �ε��� ���� ��ȯ������ ��� �迭�� sort�� �Ǿ� �ִ� ���¿��� �Ѵ�
	}

}
