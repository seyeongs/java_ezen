package javabase;

public class OperatorEx3 {

	public static void main(String[] args) {
		//�������
		int num = 10;
		num = num + 20;
		
		System.out.println(num);

		int score = 75;
		System.out.println("���� ������  = " + score + 10); //���� ���� ������ ������ ���ڿ�ȭ �ȴ�
		System.out.println("���� ������  = " + (score + 10));
		
		//����������
		int i = 0 ;
		//����
		System.out.println(i++);
		System.out.println(i--);
		System.out.println(i++);
		System.out.println(i);
		
		System.out.println(""); // ����
		
		i = 0;
		//����
		System.out.println(++i);
		System.out.println(--i);
		System.out.println(++i);
		System.out.println(i);
	}

}
