package javaThread;

public class ThreadStop extends Thread {
	private boolean stop = false;
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("���� �۾���");
		
		}
		System.out.println("�ڿ����� \n ��������");
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}
