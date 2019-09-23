package day5;

import java.util.Scanner;

public class ScannerIntro {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
			
		System.out.println("Enter your first name pleas : ");
		
		String firstname = userInput.next();
		
		System.out.println("Enter your last name pleas : ");
		
		String lastname = userInput.next();
		
		System.out.println("Dear "+firstname+" "+lastname+". "+"Welcome to the Cybertek 2019 Online Spring Class!");
	
	
	}

}
