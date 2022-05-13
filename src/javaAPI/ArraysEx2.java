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
		
		System.out.println("찾을 인덱스 위치 : " + index); //Arrays.binarySearch() 메소드는 인덱스 값을 반환하지만 대상 배열은 sort가 되어 있는 상태여야 한다
	}

}
