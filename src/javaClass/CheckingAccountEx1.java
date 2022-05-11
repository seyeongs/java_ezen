package javaClass;

public class CheckingAccountEx1 {

	public static void main(String[] args) {
		
		CheckingAccount chul = new CheckingAccount("123-123-123", "รถผ๖", 1000, "111-11");
		
		chul.deposit(30000);
		try {
			int paidAmount = chul.pay("111-11", 15000);
			System.out.println("ม๖บาพื: " + paidAmount);
			System.out.println("ภÜพื: " + chul.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
