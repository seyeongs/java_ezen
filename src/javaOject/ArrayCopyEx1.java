package javaOject;

public class ArrayCopyEx1 {

	public static void main(String[] args) {
		//�迭 ���
		int[] nums1 = {10,20,30};
		int[] nums2 = new int [5];
		
//		nums2 = nums1;
//		System.out.println(nums1); 
//		System.out.println(nums2); //nums1�� �޸� �ּҰ��� �尣��
//		System.out.println(nums2[1]); //nums1 �޸� �ּҷ� ���� �ҷ��� �� �� nums2�� ���� 0���� �Ǿ� ���� ���簡 �ƴϴ�
		
		for(int i = 0; i<nums1.length; i++) {
			nums2[i] = nums1[i];
			
		}//�迭 ����
		
		
		for(int i = 0; i<nums2.length; i++) {
			
			System.out.print(nums2[i]+"  ");
		}//num2 ���
		
		

	}

}
