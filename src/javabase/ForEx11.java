package javabase;

public class ForEx11 {

	public static void main(String[] args) {
		System.out.println("구구단을 외우자");
		System.out.println();
		
		for(int i = 2; i<=9; i++) {
			System.out.println("** "+i+"단 **");
			for(int j =1; j<=9; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println();
		}

	}

}
