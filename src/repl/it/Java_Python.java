package repl.it;

import java.util.Scanner;

public class Java_Python {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		int count1=0;
		int count2=0;
		String substr1="java";
		String substr2="python";
	
		
	for(int i=0;i<sentence.length()-substr1.length()+1;i++) {
		if(sentence.substring(i, i+4).equals(substr1)) 
			count1++;
		
	}
	
		
	for(int i=0;i<sentence.length()-substr2.length()+1;i++) {
		
		if(sentence.substring(i, i+6).equals(substr2))
			count2++;
		}
	System.out.println(count1==count2);
	}
	
	}

