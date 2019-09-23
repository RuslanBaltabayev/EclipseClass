package day8;

import java.util.Scanner;

public class CondiyionStatements {

	public static void main(String[] args) {
	
    Scanner input = new Scanner(System.in);
    System.out.println("WHAT IS YOUR SCORE?");
    int score = input.nextInt();
    
    System.out.println("YOUR SCORE IS "+score);
    
     if(score>60) {
    	 System.out.println("YOU SHALL PASS!");
     }else {
    	 System.out.println("YOU SHALL NOT PASS!");
    	 
     }
	}

}
