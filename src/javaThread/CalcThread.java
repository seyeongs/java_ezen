package javaThread;

public class CalcThread extends Thread{
	
	public CalcThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		
		for(long i=0; i<11000000000L; i++) {
			
		}
		System.out.println(getName());
	}
	
}
