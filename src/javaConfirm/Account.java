package javaConfirm;

public class Account {
	private String ano;
	private String onwer;
	private int balance;

	public Account(String ano, String onwer, int balance) {
		this.ano = ano;
		this.onwer = onwer;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOnwer() {
		return onwer;
	}

	public void setOwer(String onwer) {
		this.onwer = onwer;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
