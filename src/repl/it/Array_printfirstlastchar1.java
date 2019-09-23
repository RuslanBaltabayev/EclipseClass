package repl.it;

import java.util.Scanner;

public class Array_printfirstlastchar1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String [] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		
		for(int i=0;i<words.length;i++) {
			char last = words[i].charAt(words[i].length()-1);
			System.out.print(words[i].charAt(0)+""+last);
			System.out.println();
		}
	}

}
