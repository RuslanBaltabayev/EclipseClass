package repl.it;

import java.util.Scanner;

public class sms {

	public static void main(String[] args) {

	    
		 Scanner scan = new Scanner(System.in);
		    String message = scan.nextLine();
		    String sender;
		    String phoneNumber;
		    String messageBody;
		    
	int a = message.indexOf('<');
	int b = message.indexOf('>');
	int c = message.indexOf('[');
	int d = message.indexOf(']');
	int e = message.indexOf('{');
	int f = message.indexOf('}');
	
	System.out.println("Sender: "+message.substring(a+1,b));
	System.out.println("Phone Number: "+message.substring(c+1,d));
	System.out.println("Message body: "+message.substring(e+1,f));
	
		    
		 
	}

}
