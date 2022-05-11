package javaClass;

import java.rmi.AccessException;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			int num1 =10;
			int num2 =0;
			int result = num1/num2;
			System.out.println("결과=" + result);
		}catch(ArithmeticException e) { //예외처리 코드를 인수로 넘겨줘야 한다
			System.out.println("0으로 나눌 수 없슴");
			
		}
	}

}
