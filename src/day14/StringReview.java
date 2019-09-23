package day14;

public class StringReview {

	public static void main(String[] args) {
		
		String name = "Mehmet";
		System.out.println(name.length());
		System.out.println(name.length()-1);
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(5));
		System.out.println(name.charAt(name.length()-1));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(1));
		System.out.println(name.contains("eh"));
		System.out.println(name.contains("am"));
		System.out.println(name.indexOf("h"));
		System.out.println(name.toUpperCase().indexOf("H"));
		System.out.println(name.toLowerCase().indexOf("m"));
		

	}

}
