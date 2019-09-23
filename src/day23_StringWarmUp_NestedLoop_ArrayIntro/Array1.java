package day23_StringWarmUp_NestedLoop_ArrayIntro;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		boolean [] array1 = new boolean[3];
		short [] array2 = new short[3];
		String [] array3 = new String[3];
		Scanner [] array4 = new Scanner[3];
		
		 // once array is created with a given size 
	    // it can not be changed 
	    int[] numbers = new int[2]; 
	    // ASSIGNING VALUE to array
	    
	    // 2nd way to create an array with predefined items 
	    
	    // dataType [] variableName = new dataType[]{item1, item2 , item3....}
	    int[] nums = new int[] {1,3,4,5,8,9,0,4,-2} ;
	    
	    // getting the size of an array 
	    
	    int size = nums.length ; 
	    System.out.println( size);
	    
	    int [] nums1 = {1,2,3,4,65,7,5,43,-2};
//	    int [] num3 ;
//	    		num3 = {1,2,3,4,65,7,5,43,-2};   will not compile!!!
	    
	    System.out.println(nums1.length);
	    System.out.println("last nums1:"+(nums1[8]));
	    
		
	}

}
