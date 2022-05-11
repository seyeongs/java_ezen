package javabase;

public class ForEx6 {

	public static void main(String[] args) {
//		int num = 20;
//		int age;
//		{
//			age= 29;
//			System.out.println(num);
//		}
//		System.out.println(num);
//		System.out.println(age);
//		//System.out.println(age); 변수 영역 오류
		
		
//		for(int i = 1; i<=10; i++) {
//			if(i%2 == 0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		int sum=0;
		for(int i = 1; i<=100; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
			sum+=i;
			
		}
		System.out.println(sum);

	}
	

}
