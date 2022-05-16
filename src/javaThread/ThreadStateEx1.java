package javaThread;

public class ThreadStateEx1 {

	public static void main(String[] args) {
		
		StatePrintThread stateT = new StatePrintThread(new TargetThread());
		
		stateT.start();

	}

}
