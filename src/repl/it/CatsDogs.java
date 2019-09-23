package repl.it;

import java.util.Scanner;

public class CatsDogs {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int countOfDogs = 0;
		int countOfCats = 0;
		int i = 0;
		
		word=word.replaceAll("cat", "_");
		word=word.replaceAll("dog", "-");
		
		while(i<word.length()) {
			if(word.charAt(i)=='_') 
				++countOfCats;
			
				
			if(word.charAt(i)=='-') 
				++countOfDogs;
			
				
			++i;
		}
		System.out.println(countOfDogs==countOfCats);
	}

}
