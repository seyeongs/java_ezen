package javaAPI;

public class StringEx3 {

	public static void main(String[] args) {
//		String str = "korea";
//		String str1 = "�ȳ��ϼ���";
//		System.out.println(str.length());
//		System.out.println(str1.length());
		//������ �ѱ��� ����Ʈ ũ��� �ٸ����� ���� ���ڼ��� ����
		
//		String str = "������ �ڹ��� API�� ���� ���� �ֽ��ϴ�. �ڹٴ� ǳ���� ���̺귯���� �����մϴ�.";
//		String newStr = str.replace("�ڹ�", "Java"); //ã�� �ٲٱ�///////////////////////////////////////
//		System.out.println(newStr);
		
		String str = "�� �̸��� �������Դϴ�. ������ �ڹٸ� �����ϰ� �ֽ��ϴ�. ������ �������Դϴ�";
		String newStr = str.replace("����", "�ڹ�");
		System.out.println(newStr);
		String intro = "�� ���̴� 25���̰� Ű�� 170cm�̰� �����Դ� 55kg�Դϴ�.";
		String newItro = intro.replaceAll("[0-9]", "*");
		System.out.println(newItro);
		String hello="�ȳ��ϼ���. �ݰ�����. �� ������.";
		String newHello = hello.replaceAll("\\.", "^^"); //���� ǥ���Ŀ��� .�� ��� ���ڸ� �ǹ��Ѵ�. \.�� .�� �ǹ��� 
		System.out.println(newHello);
	}

}
