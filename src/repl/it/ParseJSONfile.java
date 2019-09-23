package repl.it;

import java.util.Scanner;

public class ParseJSONfile {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String json = scan.nextLine();
		
		int i = 0;
		int a = json.indexOf(':');
		int b = json.indexOf(':', a+1);
		int c = json.indexOf(':', b+1);
		int d = json.indexOf(',',a);
		int e = json.indexOf(',',b);
		int f = json.indexOf(',',c);
		
		String firstname =json.substring(b, e);
		String lastname =json.substring(c,f);
		
		String trimmed1= firstname.trim();
		String trimmed2 =lastname.trim();
		
		int x = trimmed1.indexOf('"');
		int y = trimmed1.indexOf('"', x+1);
		
		int xx = trimmed2.indexOf('"');
		int yy = trimmed2.indexOf('"', xx+1);
		
		String name = trimmed1.substring(x+1, y);
		String last = trimmed2.substring(xx+1, yy);
		
		System.out.println("First name: "+name);
		System.out.println("Last name: "+last);
	
			
		}
	}

