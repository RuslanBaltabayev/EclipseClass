package repl.it;

import java.util.Scanner;

public class swapfirstlastchar {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		char first = word.charAt(0);
		int w = word.length()-1;
		char last = word.charAt(word.length()-1);
		String subword = word.substring(1,w);
		System.out.println(first+subword+last);
		System.out.println(last+subword+first);
	}

}
