package repl.it;

import java.util.Scanner;

public class EqualsJavaPython {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		String a = "java";
		String b = "python";
		
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 0;i<sentence.length();i++) {
			if(a.equals(sentence.substring(i,sentence.length()-4))) {
				++count1;
			}
			
			if(b.equals(sentence.substring(i,sentence.length()-6))) {
				++count2;
			}
			
			
		}
		System.out.println(count1==count2);
	}

}
