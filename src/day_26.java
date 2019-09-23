import java.util.Scanner;

public class day_26 {

	public static void main(String[] args) {

		double weight = 0;
	    double cal = 0;
	    Scanner scan = new Scanner(System.in);
	    weight = scan.nextDouble();
	    System.out.println("Enter weight in pounds:");
	    
	    weight=weight/2.2;
	    cal=0.0175*900*weight;
	    
	    System.out.println("Calories Burned: "+(int)cal);
		
		}
	
	}


