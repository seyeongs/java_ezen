package javaClass;

public class DockdoAccountEx1 {

	public static void main(String[] args) {
		DockdoAccount chul = new DockdoAccount("111-111", "Ã¶¼ö", 0, 0);
		chul.deposit(10000);
		System.out.println("ÀÜ¾×: " + chul.balance);
		System.out.println("Æ÷ÀÎÆ®: " + chul.point);
		
		chul.deposit(50000);
		System.out.println("ÀÜ¾×: " + chul.balance);
		System.out.println("Æ÷ÀÎÆ®: " + chul.point);

	}

}
