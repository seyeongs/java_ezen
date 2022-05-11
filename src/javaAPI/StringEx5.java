package javaAPI;

public class StringEx5 {

	public static void main(String[] args) {
		String original = "Java Programming";
		
//		String lower = original.toLowerCase();//////////////////////////////////////////////
//		System.out.println(lower);
		
		String lower = original.toLowerCase();
		System.out.println(lower);
		
//		String upper = original.toUpperCase();///////////////////////////////////////////
//		System.out.println(upper);
		
		String upper = original.toUpperCase();
		System.out.println(upper);
		
//		String str = "   자바 프로그래밍     ";
//		String newStr = str.trim(); //문자열 좌우 끝에 있는 공백을 제거해준다////////////////////////////////////
//		System.out.println(newStr);
		String str= "              좌우 공백 없애랏                ";
		str = str.trim();
		System.out.println(str);
		
//		String str2 = String.valueOf(10); //문자열로 봐꿔준다////////////////////////////////////////
//		String str3 = String.valueOf(30);
//		System.out.println(str2+str3);
		
		String str2 = String.valueOf(20);
		String str3 = String.valueOf(222222);
		System.out.println(str2+str3);
		
		
	}

}
