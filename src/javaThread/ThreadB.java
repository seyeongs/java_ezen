package javaThread;

public class ThreadB extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(getName() +"�� �� �۾�");
		}
	}
	
	
}
