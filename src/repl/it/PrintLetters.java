package repl.it;

import java.util.Scanner;

public class PrintLetters {

	public static void main(String[] args) {
		Scanner  s = new Scanner (System.in);
		char start = s.next().charAt(0);
		char end = s.next().charAt(0);

		String alphabet = "";
		
		while(start<=end) {
			alphabet=alphabet+start;
			++start;
		}
		System.out.print(alphabet);
			
	}

}
