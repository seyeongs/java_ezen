package javaOject;

public class ArrayCopyEx2 {

	public static void main(String[] args) {
		
		int[] nums1 = {10,20,30};
		int[] nums2 = new int [5];
		
		
		System.arraycopy(nums1, 0, nums2, 0, nums1.length); //System.arraycopy(원본배열, 시작인덱스, 복사본배열, 시작인덱스, 복사할 인덱스 갯수);
		
		
		
		for(int i = 0; i<nums2.length; i++) {
			
			System.out.print(nums2[i]+"  ");
		}//num2 출력

	}

}
