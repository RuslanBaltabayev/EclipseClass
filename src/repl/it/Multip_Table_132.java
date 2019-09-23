package repl.it;

import java.util.Arrays;
import java.util.Scanner;


public class Multip_Table_132 {

	public static void main(String[] args) {
	
		int [][] multiplicationTable = new int[10][10];
	    
	   for(int i=0;i<multiplicationTable.length;i++) {
		   for(int j=0;j<multiplicationTable.length;j++){
			   multiplicationTable[i][j]=(i+1)*(j+1);
		   }
	   }
	    
	    
	   
	    System.out.println(Arrays.deepToString(multiplicationTable) ) ;
		
		
		
	}
	
}
