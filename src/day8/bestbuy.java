package day8;

import java.util.Scanner;

public class bestbuy {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
		double iphone = 599.99;
		double ipad = 899.99;
	    double yourbudget;
		
		int iphonecount,ipadcount;
		
		System.out.println("HOW MANY IPHONE DO YOU WANT TO BUY?");
		iphonecount = input.nextInt();
		System.out.println("PPRICE OF IPHONE WILL BE: "+iphone*iphonecount);
		
		
		System.out.println("HOW MANY IPAD DO YOU WANT TO BUY?");
		ipadcount = input.nextInt();
		
		System.out.println("PPRICE OF IPAD WILL BE: "+ipad*ipadcount);
		
		System.out.println("WHAT IS YOUR BUDGET?");
		
		yourbudget =input.nextDouble();
		
		System.out.println("YOUR BUDGET IS "+yourbudget);
		
		double purchase = iphone*iphonecount+ipad*ipadcount ;
		
		if(purchase < yourbudget){
			
			System.out.println("YOU CAN EFFORD TO BUY !");
			
		}else {
			System.out.println("YOU CANNOT EFFORD TO BUY !");
		}
		
		
		
		
		
				

	}

}
