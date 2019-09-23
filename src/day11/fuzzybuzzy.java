package day11;

import java.util.Scanner;

public class fuzzybuzzy {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write down a number");
		
		int num = scan.nextInt();
		
		if(num%5==0&&num%3==0) {
			System.out.println("fizz buzz");
			System.out.println("buzzy fuzzi");
		
		}else if(num%5==0) {
			System.out.println("fizz");
		}else if(num%3==0) { 
			System.out.println("buzz");
		}else {
			System.out.println("Noumber is not dvidible by 5 eather 3");
		
	
	}
}

}
