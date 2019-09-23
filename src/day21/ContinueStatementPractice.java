package day21;

import java.util.Scanner;

public class ContinueStatementPractice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i =1;
		
		for(i=1;i<50;++i) {
//			if(i%2==1) {
//				System.out.print(i+",");
//			}
//			if(i%4==0) {
//				System.out.print(i+",");
//			}
//			
			if(i%15==0) {
				continue;
			}
			System.out.println(i);
			
		}
		
	}

}
