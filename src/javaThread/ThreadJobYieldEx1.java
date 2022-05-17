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
		threadY1.work = false; //Thread1의 Thread.yield() 메소드가 실행되며 일시 정지
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		threadY2.work = false;//Thread2의 Thread.yield() 메소드가 실행되며 일시 정지
		threadY1.work = true;//Thread1 스레드 재실행
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		threadY1.stop = true; //종료
		threadY2.stop = true;
	}

}
