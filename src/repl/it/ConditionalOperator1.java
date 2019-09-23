package repl.it;

import java.util.Scanner;

public class ConditionalOperator1 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    
		 int y;
		 System.out.println("Enter number:");
				int x = scan.nextInt();
			
				y = (x<5)?-x:x;
					System.out.println(y);	
	}

}
