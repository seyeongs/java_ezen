package javaAPI;

public class FindAndReplaceEx1 {

	public static void main(String[] args) {
		String str = "��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�";
		int index;
		index = str.indexOf("�ڹ�");
		if(index==-1) {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� �ʴ�");
		}else {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ����");
			str= str.replace("�ڹ�", "JAVA");
			System.out.println("---> "+str);
			
		}
	}

}
