package repl.it;

import java.util.Scanner;

public class firstlastletter {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    char lastlet = word.charAt(word.length()-1);
		    char firstlet = word.charAt(0);
		    System.out.println(word.charAt(0));
		    System.out.println(lastlet);
		    System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));
		    System.out.println(firstlet+""+lastlet);
	}

}
