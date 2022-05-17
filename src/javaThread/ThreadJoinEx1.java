package javaThread;

public class ThreadJoinEx1 {

	public static void main(String[] args) {
		
		ThreadJoin1 thread1 = new ThreadJoin1();
		ThreadJoin2	thread2 = new ThreadJoin2();
		
		thread1.start();
		try {
			thread1.join(); //////////////////////////�ش� �������� �۾��� �Ϸ�� �� ���� ���� ������ �Ͻ�����
		} catch (InterruptedException e) {
		}
		
		thread2.start();
		try {
			thread2.join(); //////////////////////////�ش� �������� �۾��� �Ϸ�� �� ���� ���� ������ �Ͻ�����
		} catch (InterruptedException e) {
		}
											  //join�� ���� ��� ���
		System.out.println(thread1.getSum()); //5050
		System.out.println(thread2.getSum()); //0 
											  //main �������� �۾��̱� ������ thread2�� run() �۾��� �Ϸ�Ǳ� ���� �ֿܼ� ����
	}

}
