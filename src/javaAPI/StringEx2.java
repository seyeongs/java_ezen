package javaAPI;

public class StringEx2 {

	public static void main(String[] args) {
		String str = "�ڹ� ���α׷���";
		int index = str.indexOf("�ڹ�"); //���ڿ� �� ã���� �ϴ� ���ڿ� ��ġ�ϴ� ù ��° ������ �ε����� �����Ѵ�, -1�� ����////////////////////
		System.out.println(index);
		System.out.println(str.length()); //�ε����� �ƴ϶� ���ڼ��� ��ȯ//////////////////////////////////
		if(index != -1) {
			System.out.println("�ڹٿ� ���� ����Դϴ�");
		}else {
			System.out.println("�ڹ� ��⸸ �ϼ���");
		}
	}

}