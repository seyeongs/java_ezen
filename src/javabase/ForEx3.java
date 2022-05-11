package javabase;

public class ForEx3 {

	public static void main(String[] args) {
		System.out.println("로또 자동 번호 생성기");
		int[] lotto = new int[6];
		
		boolean run= true;
		
		while(run) {	
			for(int i = 0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			}
			
			run = false;
			
			for(int k = 0; k<lotto.length-1; k++) { 
				
				for(int j = k+1; j<lotto.length; j++) {
					
					if (lotto[k]==lotto[j]) { 
						run = true;
						System.out.println("==");
					}
				}
			}
		}
		for(int i = 0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}	
	}

}
