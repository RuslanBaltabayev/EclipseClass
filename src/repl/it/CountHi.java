package repl.it;

import java.util.Scanner;

public class CountHi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str =scan.nextLine();
		String substr = "hi";
		
		 int count=0;
		 
		 for(int i=0; i<str.length()-substr.length()+1;i++) {
			 
			 String word = str.substring(i, i+substr.length());
			 if(word.equals(substr))
			 count++;
		 }
		System.out.println(count);
	}

}
