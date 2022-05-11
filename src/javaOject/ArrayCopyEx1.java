package javaOject;

public class ArrayCopyEx1 {

	public static void main(String[] args) {
		//배열 목사
		int[] nums1 = {10,20,30};
		int[] nums2 = new int [5];
		
//		nums2 = nums1;
//		System.out.println(nums1); 
//		System.out.println(nums2); //nums1의 메모리 주소값이 드간다
//		System.out.println(nums2[1]); //nums1 메모리 주소로 가서 불러온 값 즉 nums2의 값은 0으로 되어 있음 복사가 아니다
		
		for(int i = 0; i<nums1.length; i++) {
			nums2[i] = nums1[i];
			
		}//배열 복사
		
		
		for(int i = 0; i<nums2.length; i++) {
			
			System.out.print(nums2[i]+"  ");
		}//num2 출력
		
		

	}

}
