package repl.it;

import java.util.Scanner;

public class FirstChar {

	public static void main(String[] args) {

		
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    System.out.println(word.charAt(0));
	}

}
