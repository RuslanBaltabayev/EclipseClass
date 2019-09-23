package day13;

import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		// TASK 1 
	    /*
	     * Ask user for two names 
	     * check for the equality without caring about the case   print result 
	     * 
	     * also compare the length of the names 
	     *    if name 1 has more character ---> print second character of name1
	     *    else  print 3rd character of name2
	     * 
	     *  // OPTIONAL 
	     *  store the last character of name 2 in char variable 
	     *  and create switch statement to check few cases as below 
	     *  
	     *  case 'a' --> print name ended with a 
	     *  case 'b' --> print name ended with b 
	     *  case 'c' --> print name ended with c 
	     *  if no match print  did not get abc 
	     *  
	     *  
	     * 
	     * */
		
		Scanner scan = new Scanner(System.in);
		String s1 = "turkmenistan";
		String s2 = "TURKEY";
		
		int i1 = s1.length();
		int i2 = s2.length();
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(i1);
		System.out.println(i2);
		
		if(i1>i2) {
			System.out.println(s1.charAt(1));
		}else {
			System.out.println(s2.charAt(2));
		}
		
		System.out.println((i1>i2)?s1.charAt(1):s2.charAt(2));
		
		int lastcharindex = s2.length()-1;
		char lastchar = s2.charAt(lastcharindex);
		
		
//optional
		System.out.println(lastchar);
		
		switch(lastchar) {
		case 'a':
			System.out.println("name ended with a");
			break;
		case 'b':
			System.out.println("name ended with b");
			break;
		case 'c':
			System.out.println("name ended with c");
			default:
				System.out.println("did not get abc");
		}
		
		
		
	}

}
