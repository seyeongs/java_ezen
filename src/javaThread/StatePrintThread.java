package javaThread;

public class StatePrintThread extends Thread{
	private Thread target;
	
	public StatePrintThread(Thread target) {
		this.target = target;
	}
	
	@Override
	public void run() {
		
		while(true) {
			Thread.State state = target.getState();
			System.out.println("Ÿ�� ������ ���� : " + state);
			//NEW : ������ ����
			//RUNNABLE : ���� ��� ���� 
			//TIMED_WAITING : �ð� ��� ����
			//BLOCKED : ����ȭ ��� ����
			//TERMINATED : ������ ���� ���� ����
			if(state == Thread.State.NEW) {
				
				target.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
