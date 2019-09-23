package repl.it;

import java.util.Scanner;

public class Array_printfirstlastchar2 {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		String[]words= {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
		
		System.out.print("[");
		for(int i=0;i<words.length;i++) {
			char last = words[i].charAt(words[i].length()-1);
			String firstlast = words[i].charAt(0)+""+last+", ";
			
			if(i==4)
				firstlast=firstlast.replace(", ", "");
				
			System.out.print(firstlast);
		}
System.out.print("]");
	}

}
