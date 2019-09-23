package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array_118 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	int nums[]= {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	int mid = nums.length/2;
	
	for (int i = 0; i < mid; i++) {
		
		int temp=nums[i];
		nums[i]=nums[nums.length-1-i];
		nums[nums.length-1-i]=temp;
		
		
	}
	System.out.println(Arrays.toString(nums));
	}

}
