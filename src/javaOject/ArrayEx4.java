package javaOject;

public class ArrayEx4 {

	public static void main(String[] args) {
		int[] nums = {45,2,36,12,80,35,16,71,42};
		//Â¦¼öÀÇ ÇÕ = ???
		//È¦¼öÀÇ ÇÕ = ???
		int jjacksu = 0;
		int holsu = 0;
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]%2 == 0) {
				jjacksu += nums[i];
			}else {
				holsu += nums[i];
			}
		}
		System.out.println("Â¦¼öÀÇ ÇÕ = " + jjacksu);
		System.out.println("È¦¼öÀÇ ÇÕ = " + holsu);

	}

}
