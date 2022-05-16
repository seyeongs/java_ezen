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
			System.out.println("타겟 스레드 상태 : " + state);
			//NEW : 생성된 상태
			//RUNNABLE : 실행 대기 상태 
			//TIMED_WAITING : 시간 대기 상태
			//BLOCKED : 동기화 대기 상태
			//TERMINATED : 스레드 실행 종료 상태
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
