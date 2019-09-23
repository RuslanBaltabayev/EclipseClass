package repl.it;

public class reverseLetter {

	public static void main(String[] args) {
		String str = "a#vb$?hj/k";
		String str1 = str.replaceAll("\\W", "");
		System.out.println(str1);
	}
}
