package javabase;

public class SwitchEx3 {

	public static void main(String[] args) {

		char ch = 'a';
		switch (ch) {
		case 'A':
		case 'a':
			System.out.println("apple 선택");
			break;
			
		case 'B':
		case 'b':
			System.out.println("baa 선택");
			break;
			
		case 'G':
		case 'g':
			System.out.println("gaa 선택");
			break;
			
		default :
			System.out.println("준비안됨");
		}

	}

}
