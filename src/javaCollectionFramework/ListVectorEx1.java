package javaCollectionFramework;

import java.util.List;
import java.util.Vector;

public class ListVectorEx1 {

	public static void main(String[] args) {
		List<ListVectorBoard> board = new Vector<ListVectorBoard>();
		board.add(new ListVectorBoard("�ڷγ�", "�ڷηηγ� ��", "�淳"));
		board.add(new ListVectorBoard("�ڹ�Ȱ��", "���� ����~����", "����"));
		board.add(new ListVectorBoard("�ڹ� ���� ����", "�ȵ���̵� �� �����", "����"));
		
		for(int i=0; i<board.size(); i++) {
			ListVectorBoard obj = board.get(i);
			System.out.println(obj.toString());
		}

	}

}
