package javaClass;

public class CreditLineAccountEx1 {

	public static void main(String[] args) {
		CreditLineAccount chul = new CreditLineAccount("111-111", "ö��", 10, 1000000);
		
		chul.deposit(100);
		try {//throws �޼ҵ�� Ʈ���� ĳġ��
			int amount = chul.withdraw(500000);
			System.out.println("ã�� �ݾ�: " + amount);
			System.out.println("�ܾ�: " + chul.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
