package javaThread;

public class ThreadStop extends Thread {
	private boolean stop = false;
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("현재 작업중");
		
		}
		System.out.println("자원정리 \n 실행종료");
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}
