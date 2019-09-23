package day19;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		
		palindromenumbers(1221);
		
	}
	
	public static void palindromenumbers(int num) {
		int reversenum=0;
		int originalnum=num;
		
		while(num>0) {
			reversenum=reversenum*10+num%10;
			num=num/10;
			
		}
		System.out.println(reversenum==originalnum);
	}

}
