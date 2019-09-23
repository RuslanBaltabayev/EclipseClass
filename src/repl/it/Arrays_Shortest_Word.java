package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Shortest_Word {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] str = {scan.next(), scan.next(), scan.next(),scan.next(), scan.next(), scan.next()}; 
              
		int min = str[0].length();
		int index=0;
		for(int i = 0;i<str.length;i++) {
			if(min>str[i].length()) {
				min = str[i].length();
				index = i;
			}
		
		}
		System.out.println(str[index]);
	}

}
