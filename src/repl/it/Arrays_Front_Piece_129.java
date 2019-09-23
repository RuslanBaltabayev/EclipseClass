package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Front_Piece_129 {

	public static void main(String[] args) {
		  
		Scanner scan = new Scanner(System.in);
			int size = scan.nextInt();
			int[] num = new int[size];
			for(int i =0; i < size; i++) {
				num[i] = scan.nextInt();
			}
			//WRITE YOUR CODE HERE
			
			
			
			  if(size>1) {
				  
			 int num2[]={num[0],num[1]};
				  System.out.println(Arrays.toString(num2));
			  }else {
			  System.out.println(Arrays.toString(num));
			  } 
	  }
	}