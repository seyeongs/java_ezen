package javaAPI;

public class MathEx1 {

	public static void main(String[] args) {
		int value1 = Math.abs(-5); //절대값 반환
		System.out.println(value1);
		double dvalue1 = Math.round(2.3);//반올림
		System.out.println(dvalue1);
		double dvalue2 = Math.ceil(2.3); //올림
		System.out.println(dvalue2);
		double dvalue3 = Math.floor(2.7); //내림
		System.out.println(dvalue3);
		double dvalue4 = Math.rint(2.5);////가까운 정수의 실수값 반환 반올림과 비슷하지만 5는 내림처리
		System.out.println(dvalue4);
		int max = Math.max(10, 50); //두 수 중 높은 숫자 반환
		System.out.println(max);
		int min = Math.min(10, 50); //두 수 중 작은 값 반환
		System.out.println(min);
		
		
	
	}	

}
