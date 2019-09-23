package examples;

import java.util.Arrays;
import java.util.Scanner;

public class Zombie2 {

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    int day =0;
	    int totalPopulation=1;
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	      
	    }
	    
	    System.out.println("Day "+day +" "+Arrays.toString(inhabitants));
	    
	    
	    do{
	    	day=1;
	    	
	    	for(int i = 0;i<inhabitants.length;i++) {
	    		if(inhabitants[0]==0) {
	    			inhabitants[1]/=2;
	    		}if(inhabitants[1]==0) {
	    			
	    			inhabitants[0]/=2;
	    			inhabitants[2]/=2;
	    		
	    		}if(inhabitants[2]==0) {
	    			
	    			inhabitants[1]/=2;
	    			inhabitants[3]/=2;
	    			
	    		}if(inhabitants[3]==0) {
	    		
	    			inhabitants[2]/=2;
	    			inhabitants[4]/=2;
	    		}if(inhabitants[4]==0) {
	    		
	    			inhabitants[3]/=2;
	    			inhabitants[5]/=2;
	    		}if(inhabitants[5]==0) {
	    		
	    			inhabitants[4]/=2;
	    			inhabitants[6]/=2;
	    		}if(inhabitants[6]==0) {
	    		
	    			inhabitants[5]/=2;
	    			inhabitants[7]/=2;
	    		}if(inhabitants[7]==0) {
	    		
	    			inhabitants[6]/=2;
	    			
	    	}
	    		totalPopulation+=inhabitants[i];
	    	if(totalPopulation==0)
	    	break;
	    		System.out.println("Day "+day +" "+Arrays.toString(inhabitants));
	    	
	    	day++;
	    	
	    	
			
	    	}
			
	      System.out.println("---- EXTINCT ----");
	    }while(totalPopulation==0);
	    
	}

}
