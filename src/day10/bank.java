package day10;

import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
	
		Scanner bank = new Scanner(System.in);
		System.out.println("Welcome to Cybertek Banking App");
		
		
		System.out.println("Write your account number:");
		long accountnumber = bank.nextLong();
		System.out.println("Write your password:");
		String password = bank.next();
		
		if(accountnumber == 214394 && password.equals("abc")) {
			System.out.println("successfull");
		}else {
			System.out.println("invalid");
		}
		
		
		
		
		
	}

}
