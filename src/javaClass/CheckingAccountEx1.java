package javaClass;

public class CheckingAccountEx1 {

	public static void main(String[] args) {
		
		CheckingAccount chul = new CheckingAccount("123-123-123", "ö��", 1000, "111-11");
		
		chul.deposit(30000);
		try {
			int paidAmount = chul.pay("111-11", 15000);
			System.out.println("���Ҿ�: " + paidAmount);
			System.out.println("�ܾ�: " + chul.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
