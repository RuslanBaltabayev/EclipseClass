package repl.it;

import java.util.Scanner;

public class FindUser {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter full name:");
		String fullname = s.nextLine();
		
		if(fullname.equalsIgnoreCase("Max Payn")||fullname.equalsIgnoreCase("Alan Wake")) {
			System.out.println("User found!");
		}else {
			System.out.println("User not found!");
		}
		
		
		

	}

}
