package day19;

import java.util.Scanner;

public class reversename {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		
		int i = sentence.length() ;
		
		
		while(i>=1){
			
			System.out.print(sentence.charAt(i-1));
			--i;
		}
	}

}
