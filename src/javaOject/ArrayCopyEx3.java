package javaOject;

public class ArrayCopyEx3 {

	public static void main(String[] args) {
		
		String[] str1 = {"��ö��","�̿���","�����"};
		String[] str2 = new String [5];
		
		
		System.arraycopy(str1, 0, str2, 0, str1.length); //System.arraycopy(�����迭, �����ε���, ���纻�迭, �����ε���, ������ �ε��� ����);
		
		
		
		for(int i = 0; i<str2.length; i++) {
			
			System.out.print(str2[i]+"  ");
		}//str2 ��� �� �ε������� null���� �� �ֵ�
		
		// 

	}

}
