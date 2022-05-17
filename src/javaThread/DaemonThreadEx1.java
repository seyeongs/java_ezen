package javaThread;

public class DaemonThreadEx1 {

	public static void main(String[] args) {
		DaemonThread daemon = new DaemonThread();
		daemon.setDaemon(true); //스레드를 데몬스레드 설정을 해주면 메인스레드 종료와 동시에 스레드가 끝난다
		daemon.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메인스레드종료");

	}

}
