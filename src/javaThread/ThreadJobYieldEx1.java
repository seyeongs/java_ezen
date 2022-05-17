package javaThread;

public class ThreadJobYieldEx1 {

	public static void main(String[] args) {
		ThreadJobYield threadY1 = new ThreadJobYield();
		ThreadJobYield2 threadY2 = new ThreadJobYield2();
		
		threadY1.start();
		threadY2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		threadY1.work = false; //Thread1�� Thread.yield() �޼ҵ尡 ����Ǹ� �Ͻ� ����
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		threadY2.work = false;//Thread2�� Thread.yield() �޼ҵ尡 ����Ǹ� �Ͻ� ����
		threadY1.work = true;//Thread1 ������ �����
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		threadY1.stop = true; //����
		threadY2.stop = true;
	}

}
