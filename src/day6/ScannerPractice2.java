package day6;

import java.util.Scanner;

public class ScannerPractice2 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name today : ");
		
		String name = input.next();
		
		//System.out.println("Enter your age today : ");
		
		//int age =input.nextInt();
		
		System.out.println("Your name is : "+ name);
		
		//System.out.println("Your age is : "+ age);
		
		System.out.println("Enter your birthyear :");
		
		 int birthyear = input.nextInt();
		 int age = 2019 - birthyear;
		 
		 System.out.println("Your age is :" + age );
		 
		 System.out.println("Enter byte value: ");
		 
		 byte b1 = input.nextByte();
		 
		 System.out.println("You have entered byte value "+ b1);		
		 
		 System.out.println("Enter short value: ");
		 
		 short sh1 = input.nextShort();
		
		System.out.println("Enter short value : " + sh1 );

		System.out.println("Enter your float :");
		
		float f1 =input.nextFloat();
		
		System.out.println("Your float value is"+" "+f1);
		
		System.out.println("Are you hungry?");
		
		boolean bo1 =input.nextBoolean();
		
		System.out.println("You are hungry");
		
		System.out.println("You need to eat!");
		
	System.out.println("");
		
		//System.out.println("Your name is"+" "+ name
		//		+"\n"+ "Your age is"+ " "+age );
		
		
		
	}

}
