package javaThread;

public class ThreadJobYield2 extends Thread{
	
	public boolean stop = false;//���Ῡ��
	public boolean work = true;//�۾�����
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("Thread2 �� �۾�����");
			}else {
				Thread.yield();//�ٸ� �����忡�� ���� �纸
			}
		}
		System.out.println("Thread2 ����");
	}
}
