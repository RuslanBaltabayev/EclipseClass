package day11;

import java.util.Scanner;

public class fizzbuzztest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		String result;
		
		Scanner scan = new Scanner(System.in);
		i = scan.nextInt();
		
		result=(i%5==0&&i%3==0)?"fizzBuzz":"notFizzBuzz";
		System.out.println(result);
			
		
	}

}
