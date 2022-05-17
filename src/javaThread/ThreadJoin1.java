package javaThread;
//join() 다른 쓰레드의 종료를 기다린다
public class ThreadJoin1 extends Thread{
	
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
