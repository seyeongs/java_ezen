package javaThread;

public class ThreadInterrupt extends Thread{
	@Override
	public void run() {
		try {	
			while(true) {
				System.out.println("�۾����۾���");
				Thread.sleep(1);
			
			}
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
//		System.out.println("�ڿ�����\n����������");
	}
}
