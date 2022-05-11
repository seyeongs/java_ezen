package javaClass;

public class Calculator {
	
	int sum1(int[] nums) {
		int sum = 0;
		for(int num : nums) {
			sum += num;
		}
		return sum;		
	}
	
	
	
	int sum2(int ... nums) { //매개변수의 수를 모를 경우
		int sum = 0;
		for(int num :nums) {
			sum += num;
		}
		return sum;	
	}
	
	double avg1(int[] nums) {
		int sum = sum1(nums);
		return (double)sum/nums.length;		
	}
	
	
	
	double avg2(int ... nums) { //매개변수의 수를 모를 경우
		int sum = sum2(nums); // 클래스 메소드에서 클래스 메소드 호출
		return (double)sum/nums.length;	
	}
}

