package javaException;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			String name = null;  
			System.out.println("이름: " + name.toString()); //toString()메소드는 객체의 문자정보를 가저온다 ////번지값이 null이라면 NullPointerException
		}catch(NullPointerException e) {
			System.out.println("객체의 값이 null입니다");
		}
	}

}
