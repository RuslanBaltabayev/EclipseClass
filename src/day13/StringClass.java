package day13;

public class StringClass {

	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "ABC";
		
		boolean b1 = s1.equals("abc");
		boolean b2 = s2.equals(s1);
		boolean b3 = s1.equalsIgnoreCase(s2);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		char c1 = s1.charAt(0);
		char c2 = s2.charAt(1);
		char c3 = s1.charAt(2);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	//	System.out.println(s1.charAt(3)); 3 is out of range,there are only 3 character
		
		int countOfCharacter = s1.length();
		System.out.println(countOfCharacter);
		System.out.println(s1.length());
		
		
		
	}

}
