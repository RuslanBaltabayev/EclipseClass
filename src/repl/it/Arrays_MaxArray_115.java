package repl.it;


import java.util.Arrays;
import java.util.Scanner;

public class Arrays_MaxArray_115 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words =new String[5];
	
		int max=0;
		int index=0;
		for (int  i = 0; i < 5; i++) {

		words[i]=input.nextLine();
		
		
			if(max<words[i].length()) {
				max=words[i].length();
				max=i;
			}
		}
		System.out.println(words[index]);

	}
}


