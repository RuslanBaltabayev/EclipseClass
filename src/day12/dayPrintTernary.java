package day12;

import java.util.Scanner;

public class dayPrintTernary {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int dayNum;
		String dayWord;
		
		System.out.println("Enter day number : ");
		dayNum =scan.nextInt();
		dayWord = "Unknown";
		
		dayWord = dayNum==1?"Monday"
				: dayNum==2?"Tuesday"
						:dayNum==3?"Wednesday"
								:dayNum==4?"Thursday"
										:dayNum==5?"Friday"
												:dayNum==6?"Saturday"
														:dayNum==7?"Sunday"
																:dayWord;
		System.out.println("Dayword is "+dayWord);
	}

}
