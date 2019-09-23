package day29;

import java.util.Scanner;
import java.util.Arrays;

public class WarmUp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String [][] pizza= {{"mushroom","black olive","green pepper"},
		          {"spinach","green pepper","mushroom"},
		          {"black olive","black olive","spinach"},
		          {"mushroom","mushroom","red pepper"},
		          {"banana pepper","spinach","red pepper"},
		          {"mushroom","green pepper","green pepper"},
		          {"spinach","green pepper","mushroom"}};
	
		 for (int k = 0; k < pizza.length; k++) {
			 System.out.println(Arrays.deepToString(pizza[k]));
			 
				System.out.println(Arrays.toString(pizza[k]));
		 }
		 
		
		
	}

}
