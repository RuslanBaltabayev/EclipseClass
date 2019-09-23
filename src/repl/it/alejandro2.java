package repl.it;

import java.util.Scanner;

public class alejandro2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		
		if(a.indexOf("project")>-1 && a.indexOf("alejandro")>-1) {
			System.out.println("read this mail");
		}else {
			System.out.println("dont read");
		}
	}

}
