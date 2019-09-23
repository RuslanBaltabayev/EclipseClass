package repl.it;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		long i = scan.nextLong();
		
		long n = 1;
		
		while(i>0) {
			n=n*i;
			--i;
		}
		System.out.println(n);
		
		
	}

}
