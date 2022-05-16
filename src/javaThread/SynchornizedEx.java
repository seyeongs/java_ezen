package javaThread;

public class SynchornizedEx {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		UserJob1 userJob1 = new UserJob1();
		userJob1.setCalc(calc);
		userJob1.start();
		
		
		UserJob2 userJob2 = new UserJob2();
		userJob2.setCalc(calc);
		userJob2.start();

	}

}
