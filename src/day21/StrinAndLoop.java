package day21;

import java.util.Scanner;

public class StrinAndLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scan.next();
		String reverse ="";
		
		for(int i=0; i<name.length();i++) {
			System.out.print(name.charAt(i)+",");
		}
		for(int x=name.length()-1; x>=0;--x) {
			
			System.out.print(name.charAt(x));
		}
		
	}

}
