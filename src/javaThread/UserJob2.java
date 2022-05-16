package javaThread;

public class UserJob2 extends Thread{
	private Calculator calc;
	


	public void setCalc(Calculator calc) {
		this.setName("uerJob2");
		this.calc = calc;
	}

	@Override
	public void run() {
		calc.setMemory(50);
	}
	
}
