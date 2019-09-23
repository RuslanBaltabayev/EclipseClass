package examples;

public class WarmUp {

	public static void main(String[] args) {

		String str = "Sunday is Java Day";
		//Strng str = new String("Sunday is Java Day");
		System.out.println(str.toUpperCase());
		System.out.println(""+str.charAt(str.length()-2)+str.charAt(str.length()-1));
		//OR
		System.out.println(str.substring(str.length()-2,str.length()));
		System.out.println(str.toUpperCase().substring(str.length()-2,str.length()));
		System.out.println(str.indexOf("is"));
		System.out.println(str.contains("Java"));
		int space1 = str.indexOf(" ");
		int space2 = str.indexOf(" ",space1+1);
		int space3 = str.indexOf(" ",space2+1);
		System.out.println(str.indexOf(" ",space1+1));
		System.out.println(str.substring(space2+1,space3 ));
	}

}
