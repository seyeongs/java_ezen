package javaAPI;

import java.text.MessageFormat;

public class MessageFormatEx1 {

	public static void main(String[] args) {
		String id = "hong";
		String name = "홍길동";
		String tel = "010-7277-0098";
		String text = "회원ID : {0} \n회원이름 : {1} \n전화번호 : {2}";
		String result = MessageFormat.format(text, id, name, tel);
		System.out.println(result);
		
		

	}

}
