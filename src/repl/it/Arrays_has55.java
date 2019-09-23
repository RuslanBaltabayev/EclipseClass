package repl.it;

import java.util.Scanner;

public class Arrays_has55 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[]nums;
		nums=new int[5];
		nums[0]=input.nextInt();
		nums[1]=input.nextInt();
		nums[2]=input.nextInt();
		nums[3]=input.nextInt();
		nums[4]=input.nextInt();
		
		
		boolean b=true;
		for(int i=0;i<nums.length-1;i++) {
			
				if(nums[i]==5&&nums[i+1]==5) {
					b=true;
					break;
				}else {
					b=false;
				}
				
				
			}
				System.out.println(b);
		
		}
			
				
	}



