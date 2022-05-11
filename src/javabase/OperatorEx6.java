package javabase;

public class OperatorEx6 {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 50;
		int result = (num1 > num2) ? num1 : num2; // 삼항 연산자 
//		if (num1>num2) {
//			System.out.println("두 수 중 큰 값은 " + num1 + "입니다");
//			
//		}else if(num1==num2){
//			System.out.println("두 수는 같습니다");
//		}else {
//			System.out.println("두 수 중 큰 값은 " + num2 + "입니다");
//		}
		System.out.println("두 수 중 큰 값은 " + result + "입니다");
	}
	

}
