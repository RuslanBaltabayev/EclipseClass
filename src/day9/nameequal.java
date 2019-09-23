package day9;

import java.util.Scanner;

public class nameequal {

	public static void main(String[] args) {
	
		Scanner nameequal = new Scanner(System.in);
		System.out.println("What is your name?");
		
		String name = nameequal.next();
	
		boolean b = name.equals("Ruslan");
		
		if (name.equals("Ruslan")) {
			System.out.println("That is my name");
			System.out.println(b);
		}else {
			System.out.println("That is not my name");
		}
		

	}

}
