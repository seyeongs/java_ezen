package javaClass;

public class DockdoAccountEx1 {

	public static void main(String[] args) {
		DockdoAccount chul = new DockdoAccount("111-111", "ö��", 0, 0);
		chul.deposit(10000);
		System.out.println("�ܾ�: " + chul.balance);
		System.out.println("����Ʈ: " + chul.point);
		
		chul.deposit(50000);
		System.out.println("�ܾ�: " + chul.balance);
		System.out.println("����Ʈ: " + chul.point);

	}

}
