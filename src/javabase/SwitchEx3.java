package javabase;

public class SwitchEx3 {

	public static void main(String[] args) {

		char ch = 'a';
		switch (ch) {
		case 'A':
		case 'a':
			System.out.println("apple ����");
			break;
			
		case 'B':
		case 'b':
			System.out.println("baa ����");
			break;
			
		case 'G':
		case 'g':
			System.out.println("gaa ����");
			break;
			
		default :
			System.out.println("�غ�ȵ�");
		}

	}

}
