package javaOject;

public class ArrayCopyEx2 {

	public static void main(String[] args) {
		
		int[] nums1 = {10,20,30};
		int[] nums2 = new int [5];
		
		
		System.arraycopy(nums1, 0, nums2, 0, nums1.length); //System.arraycopy(�����迭, �����ε���, ���纻�迭, �����ε���, ������ �ε��� ����);
		
		
		
		for(int i = 0; i<nums2.length; i++) {
			
			System.out.print(nums2[i]+"  ");
		}//num2 ���

	}

}
