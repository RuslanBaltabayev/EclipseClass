package day9;

import java.util.Scanner;

public class checklogin {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String username,password;
		
		System.out.println("write down your username:");
		username = scan.next();
		
		System.out.println("write down you password:");
		password = scan.next();
		
		boolean b1 = username.equals("Ruslan");
		boolean b2 = password.equals("123");
		
		if(b1&&b2) {
			System.out.println("successful");
			
		}else {
			System.out.println("failed");
		}
		

	}

}
