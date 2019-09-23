package repl.it;

import java.util.Scanner;

public class lastword {

	public static void main(String[] args) {

		
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    System.out.println(word.charAt(word.length()-1));
	}

}
