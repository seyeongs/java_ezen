package javaOject;

public class ArrayEx5 {

	public static void main(String[] args) {
		int[] scores = {78,96,85,60,90,82,70,83,55,73};
		//응시시험 점수 배열
		//합격자 수를 구하시오
		//조건) 80점 이상
		int passed= 0;
		for(int i = 0; i<scores.length; i++) {
			if(scores[i] >=80) {
				passed++;
			}
		}
		System.out.println("합격자 수 = " + passed);

	}

}
