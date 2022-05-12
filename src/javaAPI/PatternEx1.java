package javaAPI;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternEx1 {

	public static void main(String[] args) {
		//전화번호 검증
		//정규 표현식
		Scanner sc = new Scanner(System.in);
		
		
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		System.out.print("전화번호 입력>> ");
		String tel = sc.next();
		boolean result = Pattern.matches(regExp, tel); //정규 표현식 검증 
		if(result) {
			System.out.println("올바른 전화번호입니다");
		}else {
			System.out.println("전화번호 형식이 올바르지 않습니다");
		}
		
		
		
		
		System.out.print("이메일 입력>> ");
		String email = sc.next();
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		result = Pattern.matches(regExp, email); //정규 표현식 검증
		if(result) {
			System.out.println("올바른 이메일 주소입니다");
		}else {
			System.out.println("이메일 주소 형식이 올바르지 않습니다");
		}
	}

}
