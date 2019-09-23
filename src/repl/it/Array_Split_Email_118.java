package repl.it;

import java.util.Scanner;

public class Array_Split_Email_118 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String email = scan.nextLine();
		
	
			
		String[] arr = email.split("@");
		if(arr.length==2) {
			System.out.println("Email id: "+arr[0]);
			System.out.println("Email domain: "+arr[1]);
			
		}else {
			System.out.println("invalid email");
		
		}
	}

}
