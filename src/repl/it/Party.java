package repl.it;

import java.util.Scanner;

public class Party {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String guest;
		String guestlist="";
		String answer;
		
		System.out.println("Please enter guest name:");
		guest = input.next();
		System.out.println("Do you want to enter new guest name:");
		answer = input.next();
		int i = 1;
		guestlist = guest;
		
		while(answer.equalsIgnoreCase("yes")) {
			System.out.println("Please enter guest name:");
			guest = input.next();
			guestlist = guestlist.concat(", "+guest);
			System.out.println("Do you want to enter new guest name:");
			answer= input.next();
			i++;
			
		}
		
		System.out.println("Guest's list: "+guestlist);
	}

}
