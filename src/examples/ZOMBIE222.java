package examples;

import java.util.Arrays;
import java.util.Scanner;

public class ZOMBIE222 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
		int x = 0;
        int count = 1;
        int [] temp = new int [8]; 
        
        
        for (int i = 0; i < temp.length; i++)
            temp[i]= inhabitants[i];
        
        
        
        
        
        while (count>0)
        {
          count = 0;
          
          System.out.println("Day " +x +" " + Arrays.toString(inhabitants));
          x++;
          for (int i = 0; i < inhabitants.length; i++)
          {
            
               
             temp [i] = inhabitants [i]; 
              
            if((i==0 && inhabitants[i+1]==0)|| (i==(inhabitants.length-1) && inhabitants[i-1]==0))
            {
            inhabitants[i] = inhabitants[i]/2;
            }
            
            else if ((i!=0 && i!=(inhabitants.length-1)) && (temp[i-1]==0 || inhabitants[i+1]==0))
            { 
                
            //  System.out.println("i-1 is " + inhabitants[i-1]+ " temp is " + temp[i] + " and inhabitant +1 is " + inhabitants[i+1]);
              inhabitants[i] = inhabitants[i]/2;
            }
            
            
        
            
            count+=inhabitants[i];
          
          }
        }
        
        System.out.println("Day " + x +" " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");

	}
	
}
