package javaClass;

//�������
public class Account {
	//�ʵ�
	static final String BANKNMAE = "��������";
	String accountNo; //���¹�ȣ
	String ownerName; //������
	int balance; //�ܾ�
	
	Account() { //�����ڴ� ��ȯ Ÿ���� ���� 
		this.accountNo = "124-124-124-124";
		this.ownerName = "�����";
		this.balance = 0;
	}
	
	Account(String accNum, String name, int balance) { //�ϳ��� ���� Ŭ�������� �����ڴ� �������� �� ������ �䱸�Ǵ� �Ű������� �޶�� �Ѵ�
		this.accountNo = accNum;
		this.ownerName = name;
		this.balance = balance;
	}
	//�޼ҵ�
	void deposit(int amount) {
		this.balance += amount;
//		System.out.println(this.balance);
	}
	
	int withdraw(int amount) throws Exception{ //������ ����ó��
 		
		if(this.balance < amount) {
			throw new Exception("�ܾ��� �����ո�");//������ ����ó��
		}
		this.balance -= amount;
//		System.out.println(this.balance);
		return amount;
	}
}
