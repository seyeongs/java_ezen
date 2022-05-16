package javaThread;

import java.awt.Toolkit;

public class ThreadEx1 {
	
	public static void main(String[] args) {
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=1; i<=5; i++) {
//					
//					toolkit.beep();
//					try {
//						Thread.sleep(1000);
//					}catch(InterruptedException e) {
//						System.out.println(e.getMessage());
//					}	
//				}
//			}
//		});
//		
//		thread.start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=1; i<=5; i++) {
					
					toolkit.beep();
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						System.out.println(e.getMessage());
					}	
				}
			}
		}).start();
		
		for(int i=1; i<=5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

		
		
	}

}
