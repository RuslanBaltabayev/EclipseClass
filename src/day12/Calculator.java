package day12;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("Enter Operator : ");
		String operator =scan.next();
		
		if(operator.equals("+")) {
			System.out.println("the addition result is "+(num1+num2));
		}else if(operator.equals("-")) {
			System.out.println("the substruction result is "+(num1-num2));
		}else if(operator.equals("*")) {
			System.out.println("the multiplication result is "+num1*num2);
		}else if (operator.equals("/")) {
			System.out.println("the devision result is "+num1/num2);
		}else {
			System.out.println("INVALID OPERATOR");
		}
 		
		
	}

}
