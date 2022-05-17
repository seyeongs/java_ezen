package javaThread;

public class ThreadWorkObjEx1 {

	public static void main(String[] args) {
		ThreadWorkObj obj = new ThreadWorkObj();
		ThreadWorkA  threadA = new ThreadWorkA(obj);
		ThreadWorkB  threadB = new ThreadWorkB(obj);
		
		
		threadA.start();
		threadB.start();
		

	}

}
