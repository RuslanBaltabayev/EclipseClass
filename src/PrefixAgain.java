import java.util.Scanner;

public class PrefixAgain {

	public static void main(String[] args) {
	
		String secretUserName = "admin";
		String secretPassword = "abc123";
		
		Scanner scan = new Scanner(System.in);
		String userName = scan.next();
		String password = scan.next();
		
		if(userName.equals(secretUserName)&&password.equals(secretPassword))
			System.out.println("passed");
		else
			System.out.println("failed");
	}

}
