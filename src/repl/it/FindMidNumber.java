package repl.it;

import java.util.Scanner;

public class FindMidNumber {

	public static void main(String[] args) {

		/*
		 * Write a program that will return mid number out of three numbers. No need to
		 * do any calculations.
		 * 
		 * Steps to write a program: Create an object of Scanner class. Declare int 3
		 * variables: num1, num2, num3.
		 * 
		 * Example 1: Display prompt: "Enter first number:" 14 Display prompt:
		 * "Enter second number:" 52 Display prompt: "Enter third number:" 25 Display
		 * prompt: "Medium value is: 25"
		 * 
		 * Example 2: Display prompt: "Enter first number:" 140 Display prompt:
		 * "Enter second number:" 34 Display prompt: "Enter third number:" 1 Display
		 * prompt: "Medium value is: 34"
		 */
		Scanner object = new Scanner(System.in);

		System.out.println("Enter first number:");
		int num1 = object.nextInt();

		System.out.println("Enter second number:");
		int num2 = object.nextInt();

		System.out.println("Enter third number:");
		int num3 = object.nextInt();

		if (num1 > num2 && num2 > num3)
			System.out.println("Medium value is: " + num2);
		if (num2 > num3 && num3 > num1)
			System.out.println("Medium value is: " + num3);
		if (num3 > num1 && num1 > num2)
			System.out.println("Medium value is: " + num1);
		if (num3 > num2 && num2 > num1)
			System.out.println("Medium value is: " + num2);
		if (num2 > num1 && num1 > num3)
			System.out.println("Medium value is: " + num1);
		if (num1 > num3 && num3 > num2)
			System.out.println("Medium value is: " + num3);

	}
}
