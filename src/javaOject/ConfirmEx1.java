package javaOject;

public class ConfirmEx1 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		for(int num:array){
			if (max<num) {
				max = num;
			}
		}
		System.out.println("max: " + max);
	}

}
