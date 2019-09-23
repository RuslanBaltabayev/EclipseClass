package examples;

import java.util.Scanner;

public class replace {

	public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);
		double premium =0;
		String u = "ben seni seviyom!";
		String education ="";
		System.out.println(u.replace(" ",""));

		System.out.println("What is the highest level of education you have completed?");
		education = scan.nextLine();
		//scan.next();
		if (education.equalsIgnoreCase("Phd") || education.equalsIgnoreCase("Bachelors")
				|| education.equalsIgnoreCase("Masters")) {
			premium = premium - premium * 0.05;
		} else if (education.equalsIgnoreCase("doctors")) {
			premium = premium - premium * 0.1;
		} else if (education.equalsIgnoreCase("Less than High School")) {
			premium = premium + premium * 0.05;
		}
		
		System.out.println(education.replace(" ",""));
	}

}
