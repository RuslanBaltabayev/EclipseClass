package repl.it;

import java.util.Scanner;

public class longestword {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    int w1 = word1.length();
	    int w2 = word2.length();
	    
	    System.out.println((w1>w2)?word1:word2);
	}

}
