package javaThread;
//ThreadWorkA ThreadWorkB�� �����ϴ� ��ü
public class ThreadWorkObj {
	
	public synchronized void methodA() {
		System.out.println("ThreadWorkA �۾� ����");
		notify(); // �Ͻ� ���� ���¿� �ִ� '�ٸ� ������'�� ��������·� ������ش�
		try {
			wait(); // ���� �޼ҵ� �Ͻ� ����
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadWorkB �۾� ����");
		notify();// �Ͻ� ���� ���¿� �ִ� '�ٸ� ������'�� ��������·� ������ش�
		try {
			wait(); // ���� �޼ҵ� �Ͻ� ����
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
