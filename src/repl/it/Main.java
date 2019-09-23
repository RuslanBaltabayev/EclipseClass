package repl.it;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int start = input.nextInt();
		int end = input.nextInt();
		
		while(start<=end) {
			System.out.println("Step "+start);
			start++;
		}
				
	}
	

}
