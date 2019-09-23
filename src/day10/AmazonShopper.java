package day10;

import java.util.Scanner;

public class AmazonShopper {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("welcome Amazon shopper");
		
		System.out.println("what is the price?");
		double price = scan.nextDouble();
		
		System.out.println("are you prime member or not?");
		boolean isPrimeMember = scan.nextBoolean();
		
		if(isPrimeMember==true||price>35) {
			System.out.println("Your shipping is free");
		}else {
			System.out.println("Shipping is 5");
		}
		
	}

}
