package javaThread;

public class ThreadEx4 {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); //���� �������� ������ ��ȯ
		System.out.println("���α׷� ���� ������ �̸� : " + mainThread.getName());
		
		Thread ta = new ThreadA();
		System.out.println("�۾� ������ �̸� : " +ta.getName());
		ta.start();
		
		Thread tb = new ThreadB();
		System.out.println("�۾� ������ �̸� : " + tb.getName());
		tb.start();

	}

}
