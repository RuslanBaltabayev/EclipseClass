package day24;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		
		 /*
         * 1, print java 5 times in one row  java java java java java
         *         print total of 5 rows of above message
         * 2, print 1-5 in one line     
         *       print above line 5 more times  as we did in class
         *       NOW : modify this code to print
         *    1
         *    12
         *    123
         *    1234
         *    12345
         *  3, Print A-Z  26 times in 26 rows
         *    NOW :
         *     Modify the code to print as below
         *     A
         *     AB
         *     ABC
         *     ABCD
         *     ABCDE
         *     ...
         *     ...
         *     ALL THE WAY TILL Z
         * */ 
		
		Scanner scan = new Scanner(System.in);
		String str = "java";
		
		
		for(int j=1;j<=5;j++) {
			
			for(int i=0;i<5;i++)
			System.out.print(str+" ");
			System.out.println();
		}
		
		for(int k=1;k<=5;k++) {
			for(int l=1;l<=k;l++) {
				System.out.print(l+" ");
			}
			System.out.println();
		}
		
		for(int m='A';m<='Z';m++) {
			for(int n='A';n<=m;n++) {
				System.out.print((char)n+" ");
			}
			System.out.println();
		}
		
	}

}
