package repl.it;

import java.util.Arrays;


import java.util.Scanner;

public class Array_repl_115 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		
		
		
		for (int i = 0; i < words.length; i++) {
			
			words[i]=input.nextLine();
			
		}
		int max = words[0].length();
		int index=0;
		for(int i=0;i<words.length;i++) {
			if(max<words[i].length()) {
				max=words[i].length();
				index=i;
				}
			
		}
		System.out.println(words[index]);
	}
	
}


