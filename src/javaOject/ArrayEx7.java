package javaOject;

public class ArrayEx7 {

	public static void main(String[] args) {
		//foreach ���� for�� �迭Ưȭ
		//for(Ÿ�� ����; �迭�Ʒ�{}
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
