package day11;

import java.util.Scanner;

public class ConditionalAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		double price;
		String label;
		price = scan.nextDouble();
	
		label=(price>100)?"expensive":(price>90)?"modorate":"cheap";
		
		System.out.println(label);
		
	}
}