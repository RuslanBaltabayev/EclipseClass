package day6;

import java.util.Scanner;

public class UsingComparisionOperation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number 1 :");
		
		int num1 = input.nextInt();
		
		System.out.println("Enter Number 2 :");
		
		int num2 = input.nextInt();
		
		boolean isGreater = num1>num2;
		
		System.out.println("Is Number 1 greater than Number 2"+ " "+isGreater);
		
	}

}
