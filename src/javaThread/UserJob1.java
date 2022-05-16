package javaThread;
//동기화 블록(Synchronized)
//클래스를 2개 이상의 스레드가 공유할 때 1개의 스레드 작업이 끝날 때 까지 객체를 잠궈서 다른 스레드가 사용할 수 없도록 하는 거
//
public class UserJob1 extends Thread{
	
	private Calculator calc;
	

	public void setCalc(Calculator calc) {
		this.setName("uerJob1");
		this.calc = calc;
	}

	@Override
	public void run() {
		calc.setMemory(100);
	}
}
