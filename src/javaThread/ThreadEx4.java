package javaThread;

public class ThreadEx4 {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); //현재 실행중인 쓰레드 반환
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		Thread ta = new ThreadA();
		System.out.println("작업 스레드 이름 : " +ta.getName());
		ta.start();
		
		Thread tb = new ThreadB();
		System.out.println("작업 스레드 이름 : " + tb.getName());
		tb.start();

	}

}
