package javaOject;

public class ArrayEx4 {

	public static void main(String[] args) {
		int[] nums = {45,2,36,12,80,35,16,71,42};
		//¦���� �� = ???
		//Ȧ���� �� = ???
		int jjacksu = 0;
		int holsu = 0;
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]%2 == 0) {
				jjacksu += nums[i];
			}else {
				holsu += nums[i];
			}
		}
		System.out.println("¦���� �� = " + jjacksu);
		System.out.println("Ȧ���� �� = " + holsu);

	}

}
