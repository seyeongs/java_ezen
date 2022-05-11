package javaOject;

public class ArrayEx7 {

	public static void main(String[] args) {
		//foreach 향상된 for문 배열특화
		//for(타입 변수; 배열아룸{}
		int[] scores = {78,80,90,75,60};
		int sum = 0;
		double avg;
		for(int score: scores) {
			sum+=score;
		}
		System.out.println(sum);
		avg= (double)sum/scores.length;
		System.out.println(avg);
	}

}
