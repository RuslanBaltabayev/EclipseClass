package repl.it;

import java.util.Scanner;

public class seconds {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int inputseconds,hours,minutes,seconds;
		
		System.out.println("Enter seconds:");
		
		inputseconds  = scan.nextInt();
				
		
		hours = inputseconds/3600;
		minutes = inputseconds%3600/60;
		seconds = inputseconds%60;
		
		
	System.out.println(hours+" hours, "+ minutes+" minutes,"+" and "+seconds+" seconds.");
		
		

	}

}
