package javaLambdaExpressions;

import java.util.function.IntSupplier;

//함수적 인터페이스 Consumer, Supplier, Function ... 
public class SupplierEx1 {

	public static void main(String[] args) {
		IntSupplier supplier = ()->{ //매개값은 없고 리턴값이 있다
			int num = (int)(Math.random()*6)+1;
			return num;
		};
		
		System.out.println("주사위 " + supplier.getAsInt());

	}

}
