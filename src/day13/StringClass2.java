package day13;

public class StringClass2 {

	public static void main(String[] args) {
		
		String boy1 = "Usman";
		String boy2 = "Islam";
		
		int count1 = boy1.length();
		int count2 = boy2.length();
		
		System.out.println(count1);
		System.out.println(count2);
		
		int count3 = boy1.length()-1;
		int count4 = boy2.length()-1;
		
		char lastchar1 = boy1.charAt(count3);
		char lastchar2 = boy2.charAt(count4);
		
		System.out.println(lastchar1);
		System.out.println(lastchar2);
		
		String BOY1 = boy1.toUpperCase();
		System.out.println(BOY1);
		
		String BOY2 = boy2.toLowerCase();
		System.out.println(BOY2);
		
		boolean sm1 = boy1.contains("sm");
		boolean sm2 = BOY1.contains("sm");
	
		System.out.println(sm1);
		System.out.println(sm2);
	
		System.out.println(boy1.indexOf(lastchar1));
		
		String substring1 = boy1.substring(1,4);
		System.out.println(substring1);
	}

}
