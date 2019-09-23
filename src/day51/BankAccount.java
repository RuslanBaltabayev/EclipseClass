package day51;

public class BankAccount {

	String acoountName;
	long accounNumber;
	double balance;
	
	public BankAccount(String acoountName, long accounNumber, double balance) {
		
		this.acoountName = acoountName;
		this.accounNumber = accounNumber;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [acoountName=" + acoountName + ", accounNumber=" + accounNumber + ", balance=" + balance
				+ "]";
	}
	
	public double deposit(int i) {
		
		return balance;
	}
	
	public double withdraw(int j) {
		
		return balance;
	}
	
}
