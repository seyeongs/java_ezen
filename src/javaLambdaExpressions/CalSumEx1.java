package javaLambdaExpressions;

public class CalSumEx1 {

	public static void main(String[] args) {
		CalcSum cal1 = (num1, num2) -> num1+num2;
		
		int num1 = 3;
		int num2 = 4;
		
		System.out.println("두 수의 합 = " + cal1.hap(num1, num2));

	}

}
