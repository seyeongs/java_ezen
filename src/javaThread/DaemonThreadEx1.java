package javaThread;

public class DaemonThreadEx1 {

	public static void main(String[] args) {
		DaemonThread daemon = new DaemonThread();
		daemon.setDaemon(true); //�����带 ���󽺷��� ������ ���ָ� ���ν����� ����� ���ÿ� �����尡 ������
		daemon.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("���ν���������");

	}

}
