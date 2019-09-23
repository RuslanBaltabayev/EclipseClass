package repl.it;

import java.util.Scanner;

public class WithoutX_x {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
	
		if(word.startsWith("x")&word.endsWith("x")){
			System.out.println(word.replace("x",""));
		}else if (word.startsWith("X")&word.endsWith("X")) {
			System.out.println(word.replace("X",""));
		}else if(word.startsWith("x")&&word.endsWith("X")) {
			System.out.println(word.substring(1,word.length()-1));
		}else if(word.startsWith("X")&&word.endsWith("x")){
			System.out.println(word.substring(1,word.length()-1));
		}else {
			System.out.println(word);
		}

	}
	}
