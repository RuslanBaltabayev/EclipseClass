package repl.it;

import java.util.Scanner;

public class realestate {

	public static void main(String[] args) {

//		Condo
//		3
//		true
//		true
//		2
//		0.5
//		1.5
//		9
//		true

		int propertyPrice = 0;
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
		String houseType;
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");

		System.out.println("Enter your property type:");
		houseType = scan.nextLine();
		if (houseType.equalsIgnoreCase("Condo"))
			propertyPrice = 50000;
		if (houseType.equalsIgnoreCase("Townhouse"))
			propertyPrice = 75000;
		if (houseType.equalsIgnoreCase("Single Family House"))
			propertyPrice = 95000;

		System.out.println("How many bedrooms do you have?");
		numberOfBedrooms = scan.nextInt();
		propertyPrice = propertyPrice + numberOfBedrooms * 30000;
	
		System.out.println("Do you have a backyard?");
		backyard = scan.nextBoolean();
		if (houseType.equalsIgnoreCase("Condo"))
			System.out.println("Backyard is not available for condo!");
		else
			propertyPrice = propertyPrice + 5000;

		System.out.println("Do you have garage?");
		garage = scan.nextBoolean();
		System.out.println("How many spots?");
		garageSpots = scan.nextInt();
		if (garageSpots > 10)
			System.out.println("Pardon,  it's not a public parking!");
		else
			propertyPrice = propertyPrice + garageSpots * 20000;

		System.out.println("How close is metro station?");
		metroAccessibility = scan.nextFloat();
		if (metroAccessibility <= 1)
			propertyPrice = propertyPrice + 10000;
		else if (metroAccessibility > 1 & metroAccessibility < 3)
			propertyPrice = propertyPrice + 5000;
		else
			propertyPrice = propertyPrice + 0;

		System.out.println("How close is highway?");
		highwayAccessibility = scan.nextFloat();
		if (highwayAccessibility <= 1)
			propertyPrice = propertyPrice + 15000;
		if (highwayAccessibility > 1 & highwayAccessibility < 5)
			propertyPrice = propertyPrice + 8000;
		if (highwayAccessibility > 5 & highwayAccessibility <= 20)
			propertyPrice = propertyPrice + 4000;

		System.out.println("What's the rating of nearest school?");
		schoolScore = scan.nextFloat();
		if (schoolScore <= 10 & schoolScore > 8)
			propertyPrice = propertyPrice + 45000;
		else if (schoolScore < 8 & schoolScore >= 4)
			propertyPrice = propertyPrice + 20000;
		else
			propertyPrice = propertyPrice + 5000;

		System.out.println("Does any of your family members smoking?");
		smoking = scan.nextBoolean();
		if (smoking == true)
			propertyPrice = propertyPrice - 5000;

		System.out.println("Market report has been generated.");
		System.out.println("Your estimate market price is: " + propertyPrice+"$");

		scan.close();

	}

}
