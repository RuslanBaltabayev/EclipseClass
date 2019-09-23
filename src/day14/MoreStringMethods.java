package day14;

public class MoreStringMethods {

	public static void main(String[] args) {
		
		
		String name = "Merdan";
		
		System.out.println(name.substring(2,5));
		System.out.println(name.contains("rda"));
		
		String A = "Ruslan";
		System.out.println(A.charAt(A.length()-1));
		System.out.println(A.substring(A.length()-1,A.length()));
		System.out.println(A.substring(0,2));
		System.out.println(A.substring((A.length()/2),A.length()));
	}

}
