package javaThread;

public class ThreadJobYield2 extends Thread{
	
	public boolean stop = false;//종료여부
	public boolean work = true;//작업여부
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("Thread2 의 작업내용");
			}else {
				Thread.yield();//다른 쓰레드에게 실행 양보
			}
		}
		System.out.println("Thread2 종료");
	}
}
