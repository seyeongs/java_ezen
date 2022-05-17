package javaThread;

public class ThreadStopEx1 {

	public static void main(String[] args) {
		ThreadStop ts = new ThreadStop();
		
		ts.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ts.setStop(true);

	}

}