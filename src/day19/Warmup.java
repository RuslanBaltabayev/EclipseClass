package day19;

import java.util.Scanner;

public class Warmup {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		String sentence = "";
		
		
		
		while(!sentence.contains("java")) {
			
			System.out.println("Write your sentence: ");
			 sentence = scan.nextLine();
	
		
		}
			System.out.println(" END ");

		}
	
	
}

//while(! theSentence.toLowerCase().contains("java")) {
//    System.out.println("Enter the sentence");
//  theSentence = scan.nextLine();       
//}
//
//
//