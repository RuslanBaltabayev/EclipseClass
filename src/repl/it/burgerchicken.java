package repl.it;

import java.util.Scanner;

public class burgerchicken {

	public static void main(String[] args) {
	
		Scanner s =new Scanner(System.in);
		
		String in = s.next();
		float mealprice = 10f;
		float sodaprice = 2f;
		
		if(in.equals("burger")||in.equals("chicken")) {
			System.out.println(mealprice);
		}else {
			System.out.println(sodaprice);
		}

	}

}
