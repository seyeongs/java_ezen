package javaThread;

public class DaemonThread extends Thread{
	
	public void save() {
		System.out.println("�ڵ� �����");
	}
	
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			save();
		}
	}
	
	
}
