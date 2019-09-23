package examples;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Reverse_ {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		
		String reversed="";
		
		String [] splitted = sentence.split(" ");
		
		
		
		for(int i = splitted.length-1;i>=0;i--) {
			reversed+=splitted[i]+" ";
			
		}
		System.out.print(reversed);
	
	}

}
