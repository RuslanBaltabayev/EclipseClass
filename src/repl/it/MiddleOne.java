package repl.it;

import java.util.Scanner;

public class MiddleOne {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    int w = word.length();
	    
	   
	    if (w==1)
	    	System.out.println(word+word+word);
	    else if (w%2==1) 
	    	System.out.println(word.charAt(w/2));
	    
	    if (w==2)
	    	System.out.println(word+word);
	    else if (w%2==0)
	    	System.out.println(word.charAt(w/2-1)+""+word.charAt(w/2));
	    
	    
	}

}
