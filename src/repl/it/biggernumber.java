package repl.it;

import java.util.Scanner;

public class biggernumber {

	public static void main(String[] args) {
	
		Scanner s =new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a>b) {
			System.out.println(a+" is bigger");
		}else {
			System.out.println(b+" is bigger");
		}
		

	}

}
