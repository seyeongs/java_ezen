package javaAPI;

import java.text.MessageFormat;

public class MessageFormatEx1 {

	public static void main(String[] args) {
		String id = "hong";
		String name = "ȫ�浿";
		String tel = "010-7277-0098";
		String text = "ȸ��ID : {0} \nȸ���̸� : {1} \n��ȭ��ȣ : {2}";
		String result = MessageFormat.format(text, id, name, tel);
		System.out.println(result);
		
		

	}

}
