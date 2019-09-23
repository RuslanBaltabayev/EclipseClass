package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Inner_Outer {

	public static void main(String[] args) {
		
		   Scanner scan = new Scanner(System.in);
			int sizeInner = scan.nextInt();
			int sizeOuter = scan.nextInt();
			int[] inner = new int[sizeInner];
			int[] outer = new int[sizeOuter];
			int i,j;
			
			for(i =0; i < sizeInner; i++) {
				inner[i] = scan.nextInt();
			}
			for(j =0; j < sizeOuter; j++) {
				outer[j] = scan.nextInt();
			
			}
			Arrays.sort(inner);
			Arrays.sort(outer);
			//WRITE YOUR CODE HERE
			int count=0;
			boolean b=true;
			for(int k=0;k<sizeOuter;k++) {
				for(int l=0;l<sizeInner;l++) {
					if(inner[l]==outer[k])
					count++;
				}
			}
			if(count>=sizeInner) {
				System.out.println(b);
			}else {
			System.out.println(!b);
				
			}
				
	}

}
