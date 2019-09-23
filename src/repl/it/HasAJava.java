package repl.it;

import java.util.Scanner;

public class HasAJava {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		//boolean exists =false;
		int i =0;
		
		while(i<2) {
				
			System.out.println(word.indexOf("java")==0||word.indexOf("java")==1);
			++i;
			break;
		}
	
	}
	
}

