package javaException;

public class ExceptionEx1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		
		try { //정상 실행시 실행되는 실행문
			int result = num1/num2;
			System.out.println("결과" + result);
		}catch(ArithmeticException e) { //오류가 발생했을 경우에만 실행되는 실행문
			System.out.println("0으로 나눌 수 없습니다.");
		}

	}

}
