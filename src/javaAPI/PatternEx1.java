package javaAPI;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternEx1 {

	public static void main(String[] args) {
		//��ȭ��ȣ ����
		//���� ǥ����
		Scanner sc = new Scanner(System.in);
		
		
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		System.out.print("��ȭ��ȣ �Է�>> ");
		String tel = sc.next();
		boolean result = Pattern.matches(regExp, tel); //���� ǥ���� ���� 
		if(result) {
			System.out.println("�ùٸ� ��ȭ��ȣ�Դϴ�");
		}else {
			System.out.println("��ȭ��ȣ ������ �ùٸ��� �ʽ��ϴ�");
		}
		
		
		
		
		System.out.print("�̸��� �Է�>> ");
		String email = sc.next();
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		result = Pattern.matches(regExp, email); //���� ǥ���� ����
		if(result) {
			System.out.println("�ùٸ� �̸��� �ּ��Դϴ�");
		}else {
			System.out.println("�̸��� �ּ� ������ �ùٸ��� �ʽ��ϴ�");
		}
	}

}
