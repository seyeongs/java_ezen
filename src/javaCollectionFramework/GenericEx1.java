package javaCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class GenericEx1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // <>�ȿ� Ÿ���� �����ϸ� �ش� Ÿ���� �ڷḸ ���� �� �ִ�, Integer, Float, String ...
		
		list.add("dkdkdk");
		
		String str = list.get(0); //���׸��� �������� ��� ĳ������ ���� �ʾƵ� �ȴ�
		
		System.out.println(str);
		list.add("dkdkdk"); 
		list.add("dkdkdkd");
		list.add("dkdkdka");
		list.add(1, "dkdkdka");// �ε����� ������ �� �ִ�, ����Ⱑ �ƴ϶� insert(����)�� ��
		
		list.remove(2); //2�� �ε����� 3�� 3���� 4������ �ε����� �������
		for(String strr : list) {
			System.out.println(strr);
		} //���׸����� Ÿ���� �����ϸ� ���� for���� ��� �����ϴ�
		

	}

}
