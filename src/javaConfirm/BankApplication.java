package javaConfirm;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4. 출금 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
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
		System.out.println("시스템 종료");
	}
//메소드
	private static void createAccount() {
		System.out.println("-----------");	
		System.out.println("계좌생성");
		System.out.println("---------");
		System.out.print("계좌번호 :");
		String ano = scanner.next();
		System.out.print("계좌주 :");
		String onwer = scanner.next();
		System.out.println("초기입금액 :");
		int balance = scanner.nextInt();
		System.out.println("결과: 계좌가 생성되었습니다");
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
		System.out.println("계좌 목록");
		System.out.println("---------");
		for(int i =0; i<accountArray.length-1; i++) {
			if(accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() + "    " + accountArray[i].getOnwer() + "     " + accountArray[i].getBalance()); 
			}
		}
	}
	
	private static void deposit() {
		System.out.println("-----------");	
		System.out.println("예금");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		Account account = findAccount(scanner.next());
		if(account==null){
			System.out.println("결과: 계좌가 없습니다");
		}else {
			System.out.print("예금액: ");
			account.setBalance(account.getBalance()+scanner.nextInt());
			System.out.println("결과: 예금이 성공했습니다");
		}
	}
	
	private static void withdraw() {
		System.out.println("-----------");	
		System.out.println("출금");
		System.out.println("---------");
		System.out.print("계좌번호: ");
		
		Account account = findAccount(scanner.next());
		if(account==null){
			System.out.println("결과: 계좌가 없습니다");
		}else {
			System.out.print("출금액: ");
			account.setBalance(account.getBalance()-scanner.nextInt());
			System.out.println("결과: 출금이 성공했습니다");
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
