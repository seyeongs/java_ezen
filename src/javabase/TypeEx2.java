package javabase;

public class TypeEx2 {

	public static void main(String[] args) {
		int a = 320;
		double b =a; //큰 타입 = 작은 타입 / 자동타입변환
		System.out.println(b);
		
		b =  1244;
		a = (byte)b; // 작은 타입 = (작은타입)큰 타입 / 강제 타입 변환 
		System.out.println(a);
		
		

	}

}
