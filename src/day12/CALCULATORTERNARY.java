package day12;

import java.util.Scanner;

public class CALCULATORTERNARY {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 2 numbers : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.println("Enter Operator : ");
		String operator = scan.next();

		String result;

		result = operator.equals("+") ? "the addition result is " + (num1 + num2)
				: operator.equals("-") ? "the substruction result is " + (num1 - num2)
						: operator.equals("*") ? "the multiply result is " + (num1 * num2)
								: operator.equals("+") ? "the division result is " + (num1 + num2)
										: "INVALID OPERATION";

		System.out.println(result);
	}

}
