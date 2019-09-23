package examples;

import java.util.Scanner;

public class CastingChartoInt {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.next();
		
		char first = name.charAt(0);
		
		int firstchar = first;
		
		System.out.println("First character of your name is --->"+first);
		System.out.println("Decimal representation of first character of your name is "+firstchar);
		
		char last = name.charAt(name.length()-1);
		int lastchar = last;
		
		System.out.println("Last character of your name is--->"+last);
		System.out.println("Decimal representation of last character of your name is "+lastchar);

	
		
	}

}
