package javaAPI;

import java.util.regex.Pattern;

public class PatternMatchEx1 {

	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp = "[A-Za-z][A-Za-z0-9]{7,11}"; //ù��° ���ĺ� �ι�° ���ĺ�or���� =8~12��
		boolean isMatch=Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("���̵� ��밡��");
		}else {
			System.out.println("���̵� ��� �Ұ�");
		}
		
	}

}
