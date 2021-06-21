package entities;

public class BankAccount {
	
	private int accountNumber;
	private String holder;
	private double balance;
	
	public BankAccount(int accountNumber, String holder, double balance) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.balance = balance;
	}
	
	public BankAccount(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String name) {
		this.holder = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		balance -= (withdraw + 5);
	}
	
	public String toString() {
		return "Account " 
				+ accountNumber 
				+ ", "
				+ "Holder: "
				+ holder
				+ ", "
				+ "Balance: "
				+ String.format("$ %.2f", balance);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
