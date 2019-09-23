package repl.it;

import java.util.Scanner;

public class RepeatSeperator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String seperator =scan.next();
		int count = scan.nextInt();
		
		while(count>1) {
			System.out.print(word.concat(seperator));
			--count;
		}
		System.out.println(word);
	}

}
