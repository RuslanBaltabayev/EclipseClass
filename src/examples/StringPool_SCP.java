package examples;

import java.util.Scanner;

public class StringPool_SCP {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = "abc";
		String s4 = new String("abc");
		String s5;
		Scanner scan = new Scanner(System.in);
		System.out.println("write abc");
		s5 = scan.next();
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s1==s5);
		System.out.println(s2==s5);
	}

}
