package repl.it;

import java.util.Scanner;

public class Email2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String email = scan.next();
		
		String name = email.substring(0,email.indexOf("_"));
		String last = email.substring(email.indexOf("_")+1,email.indexOf("@"));
		String Domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
		String Toplevel = email.substring(email.indexOf(".")+1);
		
		name = name.replace(name.charAt(0),name.toUpperCase().charAt(0));
		last = last.replace(last.charAt(0),last.toUpperCase().charAt(0));
		
		System.out.println("First name: "+name);
		System.out.println("Last name: "+last);
		System.out.println("Domain: "+Domain);
		System.out.println("Top-Level Domain: "+Toplevel);
	}

}
