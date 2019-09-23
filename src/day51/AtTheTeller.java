package day51;

public class AtTheTeller {

	public static void main(String[] args) {
	
		SavingAccount s1 = new SavingAccount("alpi", 123456, 11000, 3.5);
		s1.deposit(1);
		System.out.println("Current amount is "+s1.balance);
	}

}
