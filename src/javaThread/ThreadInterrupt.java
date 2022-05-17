package javaThread;

public class ThreadInterrupt extends Thread{
	@Override
	public void run() {
		try {	
			while(true) {
				System.out.println("작업중작업중");
				Thread.sleep(1);
			
			}
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
//		System.out.println("자원정리\n스레드종료");
	}
}
