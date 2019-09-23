package repl.it;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class slicenumber {

	public static void main(String[] args) {
		
		Scanner object = new Scanner(System.in);
		int num,digit1,digit2,digit3,digit4,digit5;
		
		System.out.println("Enter your number:");
		num = object.nextInt();
		String number=String.valueOf(num);
//		char first = number.charAt(0);
//		char second = number.charAt(1);
//		char third = number.charAt(2);
//		char fourth = number.charAt(3);
//		char fifth = number.charAt(4);
//		
//		
//		System.out.println(first);
//		System.out.println(second);
//		System.out.println(third);
//		System.out.println(fourth);
//		System.out.println(fifth);
		
		digit1 = num%100000/10000;
		digit2 = num%10000/1000;
		digit3 = num%1000/100;
		digit4 = num%100/10;
		digit5 = num%10;
		
		
		System.out.println(digit1);
		System.out.println(digit2);
		System.out.println(digit3);
		System.out.println(digit4);
		System.out.println(digit5);
		
		
		
		
	}

}
