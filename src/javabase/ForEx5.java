package javabase;

public class ForEx5 {

	public static void main(String[] args) {
//		for(int i = 1; i<=10; i++) {
//			System.out.println(i);
//			if(i==4) {
//				System.out.println("중단");
//				break;
//			}
//		}
		//3500이 넘으료면 몇 까지 더하면 될까요
		int i;
		int sum = 0;
		System.out.println("3500이 넘으료면 몇 까지 더하면 될까요?");
		for(i = 1; i<=100; i++) {
			sum+=i;
			System.out.println(sum);
			if(sum>=3500) {
				break;
			}
		}
		System.out.println("정답:" + i + " 더한값:" + sum);
		System.out.println(sum-i);
//		System.out.println("1부터 100까지의 합은 = " + sum);
	}

}
