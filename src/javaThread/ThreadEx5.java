package javaThread;

import java.awt.Toolkit;

public class ThreadEx5 {

	public static void main(String[] args) {
		//¶÷´Ù½Ä
		Thread thread = new Thread(() -> {
			
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=1; i<=5; i++) {
					
					toolkit.beep();
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						System.out.println(e.getMessage());
					}	
				}
			});
	}

}
