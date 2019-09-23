package repl.it;
 import java.util.Scanner;

public class shoppinglist {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		String item1,item2,item3,report;
		double price1,price2,price3,totalprice;
		
		System.out.println("Enter item1 and its price:");
		item1 = scan.next();
		price1 =scan.nextDouble();
		
		System.out.println("Enter item2 and its price:");
		item2 = scan.next();
		price2 =scan.nextDouble();
		
		System.out.println("Enter item3 and its price:");
		item3 = scan.next();
		price3 =scan.nextDouble();
		
		totalprice = price1+price2+price3;
		
		System.out.println("totalprice:"+totalprice);
		
		report = item1+":"+price1+","+item2+":"+price2+","+item3+":"+price3;
		
		System.out.println(report);
		
	
		
		
		
		/*
		In this assignment you will write a program to create a shopping list and prices.

		You will use Scanner object and ask user to enter 3 items followed by its price and you will calculate total price and show as a report.

		-Declare 4 String variables item1, item2, item3, report.

		-Declare double variables price1, price2, price3, totalPrice

		-Create a Scanner object named scan.

		Execution flow with example:

		-Display prompt "Enter Item1 and its price:"
		Tomatoes
		5.5

		-Display prompt "Enter Item2 and its price:"
		Cheese
		3.5

		-Display prompt "Enter Item3 and its price:"
		Apples
		6.3

		-calculate totalPrice for all items

		-build the report variable by concatenating Strings and double values: 

		"Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3"
		*/
		
		
		
		
	}

}
