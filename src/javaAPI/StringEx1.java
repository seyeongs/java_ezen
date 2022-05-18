package javaAPI;

public class StringEx1 {

	public static void main(String[] args) {
//		String str = "자바프로그래밍";
//		char ch = str.charAt(5); //문자열의 5번 인덱스 문자 반환
//		System.out.println(ch);
		
//		String ssn = "980520-1234567";
//		//7
//		char sex = ssn.charAt(7);/////////////////////////////////////////
//		
//		if(sex=='1' || sex=='3') {
//			System.out.println("male");
//		}else {
//			System.out.println("female");
//		}
		
//		String ssn = "940923-2200400";
//		char sex = ssn.charAt(7);
//		
//		if(sex=='1' || sex=='3') {
//			System.out.println("male");
//		}else if(sex == '2' || sex == '4') {
//			System.out.println("female");
//		}
		
		String ssn = "940923-1111111";
		char sex = ssn.charAt(7);
		if(sex=='1' || sex == '3') {
			System.out.println("male");
		}else if(sex == '2' || sex == '4') {
			System.out.println("female");
		}
		

	}

}
