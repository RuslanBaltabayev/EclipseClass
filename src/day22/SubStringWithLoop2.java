package day22;

import java.util.Scanner;

public class SubStringWithLoop2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = "java kava ava";
		String target = "ava";
		
		int count = 0;
		
		for(int i=0;i<str.length()-target.length()+1;i++) {
			
			String  word = str.substring(i, i+target.length());
			
			if(word.equals(target))
			++count;
		}
	System.out.println(count);
	}

}
