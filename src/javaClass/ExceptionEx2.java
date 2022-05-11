package javaClass;

public class ExceptionEx2 {

	public static void main(String[] args) {
		int[] nums = {20, 74, 65, 25, 30};
		try{
			System.out.println(nums[2]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("¹è¿­ÀÇ ÀÎµ¦½º °ªÀÌ ¹þ¾î³µ½À´Ï´Ù");
		}

	}

}
