package day40;

public class BankAktivity {

	public static void main(String[] args) {
		
		BankAccount bank = new BankAccount();
		bank.accountHolder = "Ruslan Baltabayev";
		bank.balance = 1000;
		bank.showAccountHolder();
		bank.showBalance();
		bank.add100Dollar();
		bank.addDollar(5);
		
		System.out.println();
		
		BankAccount bank1 = new BankAccount();
		bank1.accountHolder = "Jon Snow";
		bank1.balance = 20000;
		bank1.showAccountHolder();
		bank1.showBalance();
		bank1.add100Dollar();
		bank1.addDollar(200);
	}

}
