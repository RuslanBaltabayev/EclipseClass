package day40;

public class BankAccount {

	String accountHolder;
	double balance;
	
	
	public void showAccountHolder() {
		System.out.println("Account holder name "+accountHolder);
	}
	
	public void showBalance() {
		System.out.println("Account balace "+ balance);
	}
	
	public void add100Dollar() {
		balance=balance+100;
		System.out.println("New balance "+balance);
	}
	
	public void addDollar(int x) {
		balance+=x;
		System.out.println("Last balance "+balance);
	}
	
	
	
}
