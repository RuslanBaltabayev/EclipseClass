package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverseSentence_120 {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    //TODO: Type your code below
			
			String[] str = sentence.split(" ");
			int len = str.length - 1;
			
			
			for(int i = 0; i < str.length / 2; i++) {
				
				String temp = str[i];
				str[i] = str[len - i];
				str[len -i] =  temp;
			}
			//System.out.println(Arrays.toString(str) + " ");
			
			for( String str2 :   str    ) {
				
				System.out.println(str2);
				//System.out.println();
			}
	}

}
