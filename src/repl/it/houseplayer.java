package repl.it;

import java.util.Scanner;

public class houseplayer {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		int house = s.nextInt();
		int player =s.nextInt();
		
		if(house+player>21) {
			System.out.println("bust");
		}else if(house>player) {
			System.out.println("player loss");
		}else if(house==player) {
			System.out.println("its a tie");
		}else {
			System.out.println("player wins");
		}
		

	}

}
