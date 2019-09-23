package day51;

public class SavingAccount extends BankAccount {

	double returnRate;

	public SavingAccount(String acoountName, long accounNumber, double balance, double returnRate) {
		super(acoountName, accounNumber, balance);
		this.returnRate = returnRate;
	}

	@Override
	public String toString() {
		
		return super.toString();
	}

	@Override
	public double deposit(int money) {
		balance+=money+100;
		return super.deposit(money);
	}

	@Override
	public double withdraw(int money) {
		balance-=money+10;
		return super.withdraw(money);
	}
	
	
}
