package javaThread;

public class ThreadA extends Thread{
	
	public ThreadA() {
		setName("ThreadA");
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++){
			System.out.println(getName() + "가 한 작업");
		}
	}
	
}
