package javaAPI;

import java.util.StringTokenizer;

public class StringToKenizerEx1 {

	public static void main(String[] args) {
		String str = "ȫ�浿*��ö��*�̿���";
		StringTokenizer strt = new StringTokenizer(str, "*"); //*�� �������� ��ū���� �и�//�����ڰ� �� ������ ��, �� ���� �̻��� �ȵ�
	  /*int countTokens = strt.countTokens(); //3�� ��ū�� ��ȯ��
		for(int i=0; i<countTokens; i++) {
			String name = strt.nextToken(); // ��ū�� ������ ������� �����Ѵ�
			System.out.println(name);
		}*/ //���1
		while(strt.hasMoreTokens()) { //���� �ִ� ��ū�� �ִ��� ���� ������ true, ������ false
			String name = strt.nextToken();
			System.out.println(name);
		}
		
	}

}
