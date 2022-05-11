package javaClass;

public class CalculatorEx1 {

	public static void main(String[] args) {
		int[] nums1 = {123,124,54,32,535,35};
		int result1 = 0;
		Calculator cal = new Calculator();
		result1 = cal.sum1(nums1);
		System.out.println(result1);
		
		int result2 = cal.sum1(new int[] {123,25,12});
		System.out.println(result2);
		
		
		result2 = cal.sum2(1, 2, 3);
		System.out.println(result2);
		
		double result_avg1 = cal.avg1(nums1);
		double result_avg2= cal.avg2(10,10,10,10,10);
		
		System.out.println(result_avg1);
		System.out.println(result_avg2);
	}

}
