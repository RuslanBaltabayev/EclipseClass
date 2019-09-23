package day24;

import java.util.Arrays;

public class ArrayTask {

	public static void main(String[] args) {
		
		int[] nums = {1,55,7,898,9,55,234,432} ; 
		int count =0;
		System.out.println(Arrays.toString(nums));
		String str = Arrays.toString(nums);
		System.out.println(str);
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>100)
				count++;
		}
		System.out.println(count);
				
	}

}
