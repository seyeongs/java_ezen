package javaCollectionFramework;

import java.util.ArrayList;
import java.util.List;

//List�������̽��� ���� Ŭ���� => ArrayList, Vector, LinkedList
public class ListCollectionEx1 {
	public static void main(String[] args) {
		List list = new ArrayList(); //���� Ŭ������ �̹� �ִ�
		list.add("ȫ�浿");
		list.add(10);
		list.add(2.4);
		list.add(false);
		//�پ��� Ÿ���� �ڷ����� ���� �� �ִ�
		for(int i =0; i<list.size(); i++) { //size()�� ������Ʈ ������ 0���� ���� ������ �ش�
			System.out.println(list.get(i));
		}
	}

}
//���� �迭�� ���� : String str = list.get(0); <= �Ұ����ϴ�
//				 String str = (String)list.get(0); <= �� ĳ������ ����� �Ѵ� �׷��� �ʿ��Ѱ� ���׸�
// ���׸� => Ÿ���� �Ķ���ͷ� ������ Ŭ����, �������̽��� ���Ѵ�