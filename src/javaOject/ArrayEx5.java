package javaOject;

public class ArrayEx5 {

	public static void main(String[] args) {
		int[] scores = {78,96,85,60,90,82,70,83,55,73};
		//���ý��� ���� �迭
		//�հ��� ���� ���Ͻÿ�
		//����) 80�� �̻�
		int passed= 0;
		for(int i = 0; i<scores.length; i++) {
			if(scores[i] >=80) {
				passed++;
			}
		}
		System.out.println("�հ��� �� = " + passed);

	}

}
