package day12;

import java.util.Scanner;

public class DayPrinter {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int dayNum;
		String dayWord ="Unknown";
		
		System.out.println("Enter day number : ");
		dayNum = scan.nextInt();
		
		switch(dayNum) {
		
		case 1:
			dayWord = "Monday";
			break;
		case 2:
			dayWord = "Tuesday";
			break;
		case 3:
			dayWord = "Wednesday";
			break;
		case 4:
			dayWord = "Thursday";
			break;
		case 5:
			dayWord = "Friday";
			break;
		case 6:
			dayWord = "Saturday";
			break;
		case 7:
			dayWord = "Sunday";
			break;
	
		default:
			System.out.println("INVALID DAY");
		
			
		}
		System.out.println("Dayword equal to "+dayWord);
		
		
	}

}
