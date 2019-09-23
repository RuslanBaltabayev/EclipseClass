package day20;

import java.util.Scanner;

public class CounterCaseSence {

	public static void main(String[] args) {
		
		
		String str = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("write your word");
		str = scan.next();
		
		int numA = 0;
		int i = 0;
	
		while(i<str.length()) {
			
			char a =str.charAt(i);
			
			if(a=='a'||a=='A') {
				++numA;
				
			}
			i++;
		}
		System.out.println(numA);
		
	}
	
	

}
