package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Split_Sentence_116 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String sentence = scan.nextLine();
		String words[]=sentence.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			
			System.out.print(words[i]);
			System.out.println();
		}
		
		
		
		
		
	}
	

}
