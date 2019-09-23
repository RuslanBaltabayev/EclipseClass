package repl.it;

import java.util.Scanner;

public class MiddleThree {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    int w = word.length();
	    
	    if (w>5&&w%2==1) {
	    	System.out.println(word.substring(w/2-1,w/2+2));
	    }else {
		System.out.println("invalid");
	}
	}
	

	}
	
