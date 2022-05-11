package javaException;

public class ExceptionEx3 {

	public static void main(String[] args) {
		
		int[] nums = {10,20,30,40,50};
		
		try {
			System.out.println(nums[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 값이 초과했습니다");
		}

	}

}
