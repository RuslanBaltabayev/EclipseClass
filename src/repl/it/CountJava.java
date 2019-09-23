package repl.it;

import java.util.Scanner;

public class CountJava {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		word = word.replaceAll("java", " ");
		int i = 0;
		int count = 0;
		while(i<word.length()) {
			if(word.charAt(i)==' ')
				count++;
				i++;
		}
			System.out.println(count);
		
		
		
	}

}
