package repl.it;

import java.util.Scanner;

public class ConcatenateStrings {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();
		
		char last = word1.charAt(word1.length()-1);
		char first = word2.charAt(0);
		String subword1 = word1.substring(0,word1.length()-1);
		
		if(last==first) {
			System.out.println(subword1+word2);
		}else {
			System.out.println(word1+word2);
		}
		
		
	}

}
