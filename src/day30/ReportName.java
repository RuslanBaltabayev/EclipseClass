package day30;

public class ReportName {

	public static void main(String[] args) {
		
		reportName("Ruslan","Baltabayev");
		reverseString("Ruslan");
		
	}

	
	public static void reportName(String firstname,String lastname) {
		System.out.println(firstname.length()+" "+lastname.length());
		System.out.println(firstname.charAt(0)+""+lastname.charAt(0));
	}
	
	public static void reverseString(String reverse) {
		
		for(int i = reverse.length()-1;i>=0;i--) {
		System.out.println(reverse.charAt(i));
		}
		
	}
	
	
}
