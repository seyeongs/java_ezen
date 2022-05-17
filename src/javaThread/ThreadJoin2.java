package javaThread;

public class ThreadJoin2 extends Thread {
	
	private int sum;
	
	
	@Override
	public void run() {
		for(int i = 1; i<=100; i++) {
			sum+=i;
		}
	}


	public int getSum() {
		return sum;
	}
}
