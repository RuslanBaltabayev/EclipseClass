package day27;

import java.util.Scanner;

public class ArrayOfInt {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter five numbers:");
		
		int [] nums= {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
		
		int sum=0;
		
		for (int i : nums) {
			sum+=i;
			
		}
		
		System.out.println("Sum = "+sum);
		
		int max = nums[0];
		
		for (int j : nums) {
			if(j>max) {
				max=j;
			}
			
		}
		System.out.println("Max number is: "+max);
		
		int min = nums[0];
		
		for (int k : nums) {
			if(k<min) {
				min=k;
			}
			
		}
		System.out.println("Min number is: "+min);
	}

}
