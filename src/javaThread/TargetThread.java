package javaThread;

public class TargetThread extends Thread{
	
	@Override
	public void run() {
		//�۾�1
		for(long i=0; i<=101000000000000L; i++) {
			
		}
		
		//1�� �Ͻ�����
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//�۾�2
		for(int i=0; i<=2100000000; i++) {}
	}
	
}
