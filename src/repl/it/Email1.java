package repl.it;

import java.util.Scanner;

public class Email1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String email = scan.next();
		
	if (email.contains("_")) {
		
		String name = email.substring(0, email.indexOf("_"));
		String lastname = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
		String rest = email.substring(email.indexOf("@"),email.length());	
		
		System.out.println(lastname + "_" + name + rest);
	} else {
		System.out.println(email);
	}
	
	}
	}