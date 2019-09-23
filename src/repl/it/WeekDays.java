package repl.it;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int dayNumber = scan.nextInt();
		String Dayname="Invalid";
		
		switch(dayNumber) {
		case 1:
			Dayname="Monday";
			System.out.println(Dayname);
			break;
		case 2:
			Dayname="Tuesday";
			System.out.println(Dayname);
			break;
		case 3:
			Dayname="Wednesday";
			System.out.println(Dayname);
			break;
		case 4:
			Dayname="Thursday";
			System.out.println(Dayname);
			break;
		case 5:
			Dayname="Friday";
			System.out.println(Dayname);
			break;
		case 6:
			Dayname="Saturday";
			System.out.println(Dayname);
			break;
		case 7:
			Dayname="Sunday";
			System.out.println(Dayname);
			break;
		}

	}

}
