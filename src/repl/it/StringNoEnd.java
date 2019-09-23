package repl.it;

import java.util.Scanner;

public class StringNoEnd {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		
		int last = text.length()-1;
		
		System.out.println(text.substring(0, last));
		
	}

}
