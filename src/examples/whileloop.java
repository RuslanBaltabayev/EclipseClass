package examples;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("number?");
		int num = scan.nextInt();
		
		
		int x=1;
		while (x<=num) {
			
			System.out.print(x++ +" ");
		}
		
		
		
		
	}

}
