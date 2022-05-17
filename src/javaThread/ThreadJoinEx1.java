package javaThread;

public class ThreadJoinEx1 {

	public static void main(String[] args) {
		
		ThreadJoin1 thread1 = new ThreadJoin1();
		ThreadJoin2	thread2 = new ThreadJoin2();
		
		thread1.start();
		try {
			thread1.join(); //////////////////////////해당 스레드의 작업이 완료될 때 까지 메인 스레드 일시정지
		} catch (InterruptedException e) {
		}
		
		thread2.start();
		try {
			thread2.join(); //////////////////////////해당 스레드의 작업이 완료될 때 까지 메인 스레드 일시정지
		} catch (InterruptedException e) {
		}
											  //join이 없을 경우 결과
		System.out.println(thread1.getSum()); //5050
		System.out.println(thread2.getSum()); //0 
											  //main 스레드의 작업이기 때문에 thread2의 run() 작업이 완료되기 전에 콘솔에 찍힘
	}

}
