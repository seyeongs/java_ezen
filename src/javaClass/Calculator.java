package javaClass;

public class Calculator {
	
	int sum1(int[] nums) {
		int sum = 0;
		for(int num : nums) {
			sum += num;
		}
		return sum;		
	}
	
	
	
	int sum2(int ... nums) { //�Ű������� ���� �� ���
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
	
	
	
	double avg2(int ... nums) { //�Ű������� ���� �� ���
		int sum = sum2(nums); // Ŭ���� �޼ҵ忡�� Ŭ���� �޼ҵ� ȣ��
		return (double)sum/nums.length;	
	}
}

