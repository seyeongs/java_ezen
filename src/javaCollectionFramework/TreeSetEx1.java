package javaCollectionFramework;

import java.util.TreeSet;

public class TreeSetEx1 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<Integer>(); //�˻���ȭ �÷��� // ���� �˻��� ���� ���������// left|value|right <-�̷� ��尴ü ������ 
		scores.add(70);
		scores.add(95);
		scores.add(62);
		scores.add(88);
		scores.add(80);
		scores.add(67);
		scores.add(98);
		
		System.out.println("���� ���� ���� :" + scores.last()); //������ ��
		System.out.println("���� ���� ���� :" + scores.first());//���� ��
		System.out.println("88 �Ʒ� ���� :" + scores.lower(88)); //88���� ����
		System.out.println("88 �� ���� :" + scores.higher(88)); //88���� ������
		
		int jumsu;
		
		while(!scores.isEmpty()) {
			jumsu = scores.pollFirst(); //���� ���� �� ������
			System.out.println("���� ���� : " + jumsu);
			System.out.println("���� �� : " + scores.size());
			
		}
		

	}

}
