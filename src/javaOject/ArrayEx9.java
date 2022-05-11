package javaOject;

public class ArrayEx9 {

	public static void main(String[] args) {
		//int[][] array = new int[2][2];
		//array[0][0], [0][1]
		//array[1][0], [1][1]
		
		//int[][] array = new int[2][];
		//array[0] = new int[3];
		//array[1] = new int[2];
		//array[0][0], [0][1], [0][2]
		//array[1][0], [1][1]
		
		int[][] nums = new int[2][3];
		nums[0][0]= 50;
		nums[1][1]= 50;
		for(int a=0; a<nums.length; a++) {
			for(int b=0; b<nums[a].length; b++) {
				System.out.println(nums[a][b]);
			}
		}
	}

}
