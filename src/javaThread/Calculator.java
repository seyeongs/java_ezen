package javaThread;
//공유 클래스
public class Calculator {
	private int memory;
	
	
	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) { //동기화 메소드(Synchronized)
													 //클래스를 2개 이상의 스레드가 공유할 때 1개의 스레드 작업이 끝날 때 까지 객체를 잠궈서 다른 스레드가 사용할 수 없도록 하는 작업
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+";" + this.memory);
	}
	
	
}
