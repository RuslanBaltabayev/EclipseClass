package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class Diving_133 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		float [] score = new float[7];
		float sum=0;
		float total=0;
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("Enter score for judge "+(i+1));
			score[i]=scan.nextFloat();
			if(score[i]>0&&score[i]<10) {
				sum+=score[i];

			}
		}

		
			float min = score[0];
			for (int j = 0; j < score.length; j++) {
				if(min>score[j]) {
					min=score[j];
				}
				
			}
			sum-=min;
			
			float max = score[0];
			for (int j = 0; j < score.length; j++) {
				if(max<score[j]) {
					max=score[j];
				}
				
			}
			sum-=max;
			
			System.out.println("Enter difficulty:");
			float diff = scan.nextFloat();
			if(diff<3.8&&diff>1.2) {
				
			}
			total=sum*diff;
			total*=0.6;
			System.out.println("Total: "+total);
		}
	
		
	}
