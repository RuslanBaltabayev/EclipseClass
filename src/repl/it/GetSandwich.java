package repl.it;

import java.util.Scanner;

public class GetSandwich {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		
		int b = str.indexOf("bread");
		int b1 = str.indexOf("bread", b+6);
		
		
		if(b1-b>0) {
			System.out.println(str.substring(b+5, b1));
			
		}else {
			System.out.println("nothing");
		}
		
	}

}
