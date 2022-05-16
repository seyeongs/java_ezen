package javaAPI;

import java.util.regex.Pattern;

public class PatternMatchEx1 {

	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp = "[A-Za-z][A-Za-z0-9]{7,11}"; //첫번째 알파벳 두번째 알파벳or숫자 =8~12자
		boolean isMatch=Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("아이디 사용가능");
		}else {
			System.out.println("아이디 사용 불가");
		}
		
	}

}
