package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class Decimal_Binary_119 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int decimal = scan.nextInt();
		int [] binary = new int[8];

		for(int i=binary.length-1;i>=0;i--) {
			binary[i]=decimal%2;
			decimal=decimal/2;
		}
		System.out.println(Arrays.toString(binary));

	}


}
