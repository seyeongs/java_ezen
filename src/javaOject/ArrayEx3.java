package javaOject;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] scores = {85, 96, 60, 85, 77};
		int sum = 0;
		double avg;
		//���� = ??
		//��� = ??
		for(int i = 0; i<scores.length; i++) {
			sum += scores[i];
			
		}
		avg = (double)sum/scores.length;
		
		System.out.println("���� = " + sum);
		System.out.println("��� = " + avg);

	}

}
