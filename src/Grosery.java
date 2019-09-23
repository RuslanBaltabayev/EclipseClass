import java.util.Arrays;
import java.util.Scanner;

public class Grosery {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String grocery =" tomato,onion,cucumber";
		
		String[] part = grocery.split(",");
		System.out.println(Arrays.toString(part));
		
	}

}
