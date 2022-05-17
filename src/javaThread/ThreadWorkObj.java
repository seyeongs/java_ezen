package javaThread;
//ThreadWorkA ThreadWorkB가 공유하는 객체
public class ThreadWorkObj {
	
	public synchronized void methodA() {
		System.out.println("ThreadWorkA 작업 실행");
		notify(); // 일시 정지 상태에 있는 '다른 스레드'를 실행대기상태로 만들어준다
		try {
			wait(); // 현재 메소드 일시 정지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadWorkB 작업 실행");
		notify();// 일시 정지 상태에 있는 '다른 스레드'를 실행대기상태로 만들어준다
		try {
			wait(); // 현재 메소드 일시 정지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
