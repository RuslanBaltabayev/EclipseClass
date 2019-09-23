package repl.it;

import java.util.Scanner;

public class ReverseaString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int w = word.length();
		
		if (w==5) {
			System.out.println(word.charAt(4)+""+word.charAt(3)+""+word.charAt(2)+""+word.charAt(1)+word.charAt(0));
			
		}else if(w<5) {
			System.out.println("Too short!");
		}else if(w>5) {
			System.out.println("Too long!");
		}
				
	}

}

