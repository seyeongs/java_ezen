package javaException;

public class ExceptionEx1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		
		try { //���� ����� ����Ǵ� ���๮
			int result = num1/num2;
			System.out.println("���" + result);
		}catch(ArithmeticException e) { //������ �߻����� ��쿡�� ����Ǵ� ���๮
			System.out.println("0���� ���� �� �����ϴ�.");
		}

	}

}
