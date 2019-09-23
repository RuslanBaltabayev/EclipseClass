package day20;

import java.util.Scanner;

public class dowhilesum {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int x = 1;
		
		
		do {
			System.out.println("x is: "+x+","+"sum is: "+sum);
			++x;
			sum = sum +x;
			if(sum>=40) {
				break;
			}
		}while(x<=10);
			
		
	}

}
