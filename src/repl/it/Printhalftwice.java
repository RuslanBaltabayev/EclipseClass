package repl.it;

import java.util.Scanner;

public class Printhalftwice {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int midword = word.length()/2;
		String halfword = word.substring(0,midword);
		System.out.println(halfword+halfword);
	}

}
