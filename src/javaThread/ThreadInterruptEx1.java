package javaThread;

public class ThreadInterruptEx1 {

	public static void main(String[] args) {
		ThreadInterrupt ti = new ThreadInterrupt();
		ti.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ti.interrupt();

	}

}
