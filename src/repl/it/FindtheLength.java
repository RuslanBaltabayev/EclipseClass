package repl.it;

import java.util.Scanner;

public class FindtheLength {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the text:");
		String text = s.nextLine();
		System.out.println("Length is: "+text.length());

	}

}
