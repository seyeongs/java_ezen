package javabase;

public class ForEx9 {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			for(int b=15; b>=i; b--) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}