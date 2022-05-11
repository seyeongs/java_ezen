package javaClass;

public class AccountEx2 {

	public static void main(String[] args) {
		String name = "������";
		String accNum = "123-456-789";
		int balance = 100000;
		
		System.out.println(Account.BANKNMAE);
		
		Account acc_default = new Account();//���� Ŭ�������� �����ڴ� �������� �� �ִ�
		Account acc_sy = new Account(accNum, name, balance);
		Account acc_ks = new Account("123-2421-4124-12412-1244124", "������", 0);
		acc_sy.deposit(20000);
		acc_ks.deposit(30000);
		acc_sy.deposit(3553);
		try {
			acc_ks.withdraw(643463);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		printAccount(acc_sy);
		printAccount(acc_ks);
		printAccount(new Account("090--=90=-=0-", "dlraud", 543443));
	}
	static void printAccount(Account acc) {
		
		System.out.println("���¹�ȣ: " + acc.accountNo);
		System.out.println("������: " + acc.ownerName);
		System.out.println("�ܾ�: " + acc.balance);
		System.out.println("-------------------------");
		
	}

}
