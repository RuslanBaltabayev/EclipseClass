package repl.it;

import java.util.Scanner;

public class Mergethem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();
		
		boolean w1 = word1.length()==3;
		boolean w2 =word2.length()==3;
		
		if(w1==true&&w2==true) {
			System.out.println(word1.charAt(0)+""+word2.charAt(0)+""+word1.charAt(1)+""+word2.charAt(1)
			+""+word1.charAt(2)+""+word2.charAt(2));
		}else {
			System.out.println("cannot merge");
		}
	}

}
