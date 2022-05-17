package javaThread;

public class ThreadWorkB extends Thread{
	private ThreadWorkObj obj;
	
	
	public ThreadWorkB(ThreadWorkObj obj) {
		this.obj = obj;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			obj.methodB();
		}
	}
}
