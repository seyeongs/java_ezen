package javabase;

public class CornfirmEx2 {

	public static void main(String[] args) {
		int[] dice = {0, 0};
		int sum;
		while(true) {
			dice[0] = (int)(Math.random()*6)+1;
			dice[1] = (int)(Math.random()*6)+1;
			System.out.println("(´«"+dice[0]+", ´«" + dice[1] + ")");
			sum = dice[0] + dice[1];
			if(sum == 5) {
				break;
			}
			
			
		}

	}

}
