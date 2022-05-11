package javaOject;

public class StringEx1 {

	public static void main(String[] args) {
		
//		String str1 = "김형수";
//		
//		String str2 = "홍길동";
//		if(str1 == str2) { //문자열 비교는 String 객체 매소드를 사용한다. ex str1.equals(str2);
//			System.out.println("str1과 str2 참조가 같다");
//		}else {
//			System.out.println("str1과 str2 참조가 다르다");
//		}
//		
//		if(str1.equals(str2)) { //문자열 비교는 String 객체 매소드를 사용한다. ex str1.equals(str2);
//			System.out.println(" 두 값이 같다");
//		}else {
//			System.out.println("두 값이 다르다");
//		}
		String str3 = new String("김철수");
		String str4 = new String("김철수");
		
		if(str3 == str4) { //문자열 비교는 String 객체 매소드를 사용한다. ex str1.equals(str2);
			System.out.println("str1과 str2 참조가 같다");
		}else {
			System.out.println("str1과 str2 참조가 다르다");
		}
		
		if(str3.equals(str4)) { //문자열 비교는 String 객체 매소드를 사용한다. ex str1.equals(str2);
			System.out.println(" 두 값이 같다");
		}else {
			System.out.println("두 값이 다르다");
		}
	}
	
}

