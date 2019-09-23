package repl.it;

import java.util.Scanner;

public class HappyValleySchoolSystem {

	public static void main(String[] args) {
	
		
		
		Scanner scan = new Scanner(System.in);
		int age = 0;
	
		System.out.println("Enter age:");
		age = scan.nextInt();
		
		
		  switch(age) { 
		  case 2: 
			  System.out.println("toddler"); 
		  break;
		  case 3:
		  case 4:
		  case 5: 
			  System.out.println("early childhood");
		  break;
		  case 6:
		  case 7: 
			   System.out.println("young reader");
		  break; 
		  case 8:
		  case 9:
		  case 10:
			System.out.println("elementary"); 
		  break; 
		  case 11:
		  case 12: 
			 System.out.println("middle"); 
		  break;
		  case 13: 
			  System.out.println("impossible");
		  break; 
		  case 14:
		  case 15:
		  case 16:
			  System.out.println("high school");
		  break;
		  case 17:
		  case 18:
			System.out.println("scolar");
		  default: 
			  System.out.println("ineligible");
  }
	
//		   if(age==2) {
//				System.out.println("toddler");
//			}else if(age>=3&&age<=5) {
//				System.out.println("early childhood");
//			}else if(age==6||age==7) {
//				System.out.println("young reader");
//			}else if(age>=8&&age<=10) {
//				System.out.println("elementary");
//			}else if(age==11||age==12) {
//				System.out.println("middle");
//			}else if(age==13) {
//				System.out.println("impossible");
//			}else if(age>=14&&age<=16) {
//				System.out.println("high school");
//	  		}else if(age==17||age==18) {
//	  			System.out.println("scholar");
//			}else {
//				System.out.println("ineligible");
//			}
		   
				}
}

