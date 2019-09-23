package repl.it;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
	    String reverse = "";
	    word = word.toLowerCase().replace(" ", "");
	    int i = word.length()-1;
	    
	    
	    while(i>=0) {
	    	
	    	reverse = reverse+word.charAt(i);
	    	--i;
	    }
	    
	    System.out.print(reverse.equals(word));
	}

}



















