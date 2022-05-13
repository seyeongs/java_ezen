package javaAPI;

public class WrapperEx1 {

	public static void main(String[] args) {
		//Wrapper(포장)클래스
		Integer obj1 = new Integer(10); //취소선 = 옛날 타입 방식 java5 전 
		Integer obj2 = 20; //자동 Boxing //java5부터 추가된 기능
		//기본타입이지만 참조타입처럼 주소 값을 찾아가야 대응하는 값이 있는 포장의 개념
		System.out.println(obj2.intValue());
		int value = obj1; //기본타입에 객체를 대입해도 자동 Unboxing을 해주기 때문에 오류가 나지 않는다
		System.out.println(value);
		
		String str1 = "20";
		String str2 = "2.54";
		int value1 = Integer.parseInt(str1);
		double value2 = Double.parseDouble(str2);
		
	}

}
