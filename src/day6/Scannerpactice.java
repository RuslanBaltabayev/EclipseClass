package day6;

import java.util.Scanner;

public class Scannerpactice {

	public static void main(String[] args) {
		
		 int i = 10;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your mood today : ");
		
		String mood = input.nextLine();
		
		System.out.println("Enter your location today :");
		
		String location = input.nextLine();
		
		System.out.println("Your mood is : "+" "+ mood);
		System.out.println("Your location is : "+" "+ location);
		
		input.close();
		
		
		
	}

}