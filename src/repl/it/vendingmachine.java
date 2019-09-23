package repl.it;

import java.util.Scanner;

public class vendingmachine {

	public static void main(String[] args) {

		Scanner object = new Scanner(System.in);
		int itemPrice, quarters, dimes, nickels, change;

		/*
		 * Write a program that determines the change to be dispensed from a vending
		 * machine. An item in the machine can cost between 25 cents and 1 dollar, in
		 * 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), and the machine
		 * accepts only a single dollar bill to pay for the item.
		 * 
		 * - int variable itemPrice - int variables quarters, dimes, nickels - Scanner
		 * object
		 * 
		 * Program accepts itemPrice, which is a price for the item you would like to
		 * purchase.
		 * 
		 * Positive behaviour:
		 * 
		 * Please follow the example in the image. dots mean empty space. -Since the
		 * item price was entered 95, change is 1 nickels
		 * 
		 * Negative behaviour:
		 * 
		 * If itemPrice is less than 25 or more than 100 cents, then display error
		 * message: Invalid price!
		 * 
		 * If itemPrice is not divisible by 5, then also display error message: Invalid
		 * price!
		 * 
		 * use (itemPrice % 5 == 0) expression to find it is divisible by 5.
		 * 
		 * Do not display anything else.
		 */

		System.out.println("Enter price in cents:");
		itemPrice = object.nextInt();
		change = 100 - itemPrice;
		quarters = change / 25;
		dimes = change % 25 / 10;
		nickels = change % 25 % 10 / 5;

		if (itemPrice >= 25 && itemPrice <= 100 && itemPrice % 5 == 0) {
			System.out
					.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels.");

		} else {

			System.out.println("Invalid price!");
		}
	}
}
