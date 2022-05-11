package javaConfirm;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4. ��� | 5.����");
			System.out.println("----------------------------------------------");
			System.out.print("����> ");
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("�ý��� ����");
	}
//�޼ҵ�
	private static void createAccount() {
		System.out.println("-----------");	
		System.out.println("���»���");
		System.out.println("---------");
		System.out.print("���¹�ȣ :");
		String ano = scanner.next();
		System.out.print("������ :");
		String onwer = scanner.next();
		System.out.println("�ʱ��Աݾ� :");
		int balance = scanner.nextInt();
		System.out.println("���: ���°� �����Ǿ����ϴ�");
		Account account = new Account(ano, onwer, balance);
		for(int i =0; i<accountArray.length-1; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = account;
				break;
			}
		}	
	}
		
	private static void accountList() {
		System.out.println("-----------");	
		System.out.println("���� ���");
		System.out.println("---------");
		for(int i =0; i<accountArray.length-1; i++) {
			if(accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() + "    " + accountArray[i].getOnwer() + "     " + accountArray[i].getBalance()); 
			}
		}
	}
	
	private static void deposit() {
		System.out.println("-----------");	
		System.out.println("����");
		System.out.println("---------");
		System.out.print("���¹�ȣ: ");
		Account account = findAccount(scanner.next());
		if(account==null){
			System.out.println("���: ���°� �����ϴ�");
		}else {
			System.out.print("���ݾ�: ");
			account.setBalance(account.getBalance()+scanner.nextInt());
			System.out.println("���: ������ �����߽��ϴ�");
		}
	}
	
	private static void withdraw() {
		System.out.println("-----------");	
		System.out.println("���");
		System.out.println("---------");
		System.out.print("���¹�ȣ: ");
		
		Account account = findAccount(scanner.next());
		if(account==null){
			System.out.println("���: ���°� �����ϴ�");
		}else {
			System.out.print("��ݾ�: ");
			account.setBalance(account.getBalance()-scanner.nextInt());
			System.out.println("���: ����� �����߽��ϴ�");
		}
	}
	
	private static Account findAccount(String ano) {
		Account acc = null;
		for(int i =0; i<accountArray.length-1; i++) {
			if(accountArray[i] != null) {	
				if(accountArray[i].getAno().equals(ano)) {
						acc =accountArray[i];
						break;
				}
			}
		}
		return acc;
	}

}
