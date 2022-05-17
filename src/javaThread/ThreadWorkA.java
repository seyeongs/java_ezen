package javaThread;

public class ThreadWorkA extends Thread{
	
	private ThreadWorkObj obj;
	
	
	public ThreadWorkA(ThreadWorkObj obj) {
		this.obj = obj;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			obj.methodA();
		}
	}
}
