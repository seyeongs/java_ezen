package javaClass;

public class AccountEx1 {

	public static void main(String[] args) {
		int amount=0;
		
//		Account account_seyeong = new Account(); //new: �ν��Ͻ� ����
//		account_seyeong.accountNo= "111-222-333-444";
//		account_seyeong.ownerName= "����";
//		account_seyeong.balance = 100000;
//		
//		account_seyeong.deposit(10000);
////		amount = account_seyeong.withdraw(3000);
//		
//		System.out.println("ã�� �ݾ�: "+amount);
//		System.out.println("�ܾ�: "+account_seyeong.balance);
//		
		
		
		Account account_gil = new Account(); 
		account_gil.accountNo= "121-212-343-434";
		account_gil.ownerName= "��";
		account_gil.balance = 0;
		
		account_gil.deposit(1000);
		try {
			amount = account_gil.withdraw(30000000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("ã�� �ݾ�: "+amount);
		System.out.println("�ܾ�: "+account_gil.balance);
		
		

	}
}
