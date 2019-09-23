package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class Zombie_Attack_1 {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	   int[]zero = new int [8];
	    
	 
	    for(int i=0; i<inhabitants.length; i++) {
	        inhabitants[i] = input.nextInt();
	    }
	    
	    for (int i = 0; i < inhabitants.length; i++) {
			
		
	    for(int j=0;j<inhabitants.length;j++) {
	    	if(i>0)
	    	inhabitants[j]/=2;
	    	
	    }
	    System.out.println("Day "+i+" "+Arrays.toString(inhabitants));
	    if(Arrays.equals(inhabitants, zero))
	    	break;
	    }
	    System.out.println("---- EXTINCT ----");
	}

}
