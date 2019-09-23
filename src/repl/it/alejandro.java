package repl.it;

import java.util.Scanner;

public class alejandro {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		
		if(a.indexOf("alejandro")>-1) {
			System.out.println("read this mail");
		}else {
			System.out.println("dont read");
		}
		
	}

}
