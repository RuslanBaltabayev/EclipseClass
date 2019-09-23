package repl.it;

import java.util.Scanner;

public class Array_NonDublicate {

	public static void main(String[] args) {
	
		Scanner input =new Scanner(System.in);
		int[]nums= {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		
		   for(int i=0;i<nums.length;i++){
			     int count =0;
			     for(int j=0;j<nums.length;j++){
			       if(nums[i]==nums[j])
			       count++;
			       
			     }
			     if(count==1) {
			    	  System.out.println(nums[i]);
			     break;
			     }
			    
			   }
			    
		  }
		}