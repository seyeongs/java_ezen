package javabase;

public class ForEx11 {

	public static void main(String[] args) {
		System.out.println("�������� �ܿ���");
		System.out.println();
		
		for(int i = 2; i<=9; i++) {
			System.out.println("** "+i+"�� **");
			for(int j =1; j<=9; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println();
		}

	}

}
