package repl.it;

import java.util.Scanner;

public class CarInsuranceQuote {

	public static void main(String[] args) {

		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		int zipcode = 0;
		int age;
		int experience;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		String driverlicence;
		String accidentYesorNo;

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		System.out.println("Enter your name");
		name = scan.nextLine();

		System.out.println("Do you have a US driver license?");
		driverlicence = scan.nextLine();
		if (driverlicence.equalsIgnoreCase("no")) {
			System.out.println("Invalid data!");
			System.exit(0);
		} else if (driverlicence.equalsIgnoreCase("yes")) {

		}

		System.out.println("Enter your zip code");
		zipcode = scan.nextInt();
		if (zipcode == 20910 || zipcode == 20740) {
			premium = premium + 60;
		} else if (zipcode == 22102 || zipcode == 22103) {
			premium = premium + 30;
		} else {
			premium = premium + 50;
		}

		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership = scan.next();

		if (vehicleOwnership.equalsIgnoreCase("owned")) {
			premium = premium + 10;
		} else {
			premium = premium + 20;
		}

		System.out.println("How is this vehicle primarily used?");
		vehicleUsage = scan.next();
		if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
			premium = premium + 10;
		} else if (vehicleUsage.equalsIgnoreCase("Business")) {
			premium = premium + 50;
		} else if (vehicleUsage.equalsIgnoreCase("Commute")) {
			premium = premium + 20;
			System.out.println("Days Driven To Work And/Or School");
			daysDrivenToWorkOrSchool = scan.nextInt();
			premium = premium + daysDrivenToWorkOrSchool * 5;
			System.out.println("Miles Driven To Work And/Or School");
			milesToWorkOrSchool = scan.nextInt();
			premium = premium + milesToWorkOrSchool * 1;
		}

		System.out.println("How old are you?");
		age = scan.nextInt();
		if (age < 16) {
			System.out.println("Invalid data!");
			System.exit(0);
		} else if (age > 16 && age < 18) {
			premium = premium * 20;
		} else if (age >= 18 && age <= 21) {
			premium = premium * 6;
		} else if (age > 21 && age < 25) {
			premium = premium * 2;
		} 
		
		System.out.println("How many years you've been driving?");
		experience = scan.nextInt();
		if (experience > 0 && (age - experience) >= 16) {
			premium = premium - experience*5;
		} else {
			System.out.println("Invalid data!");
		}

		System.out.println("Have you had any accidents in the last 5 years?");
		accidentYesorNo = scan.next();
		if (accidentYesorNo.equalsIgnoreCase("yes")) {
			System.out.println("How many?");
			accidentsAmount = scan.nextInt();
			premium +=(premium*0.2)*accidentsAmount;
		}

		System.out.println("Have you had continuous insurance for the past 12 months?");
		continuousInsurance = scan.next();
		if (continuousInsurance.equalsIgnoreCase("no")) {
			premium = premium * 2;
		}

		System.out.println("What is the highest level of education you have completed?");
		scan.nextLine();
		education = scan.nextLine();

		if (education.equalsIgnoreCase("Phd") || education.equalsIgnoreCase("Bachelors")
				|| education.equalsIgnoreCase("Masters")) {
			premium = premium - premium * 0.05;
		} else if (education.equalsIgnoreCase("doctors")) {
			premium = premium - premium * 0.1;
		} else if (education.equalsIgnoreCase("Less than High School")) {
			premium = premium + premium * 0.05;
		}
		
		System.out.println(name + ", here's your quote!");
		System.out.println("Start Your Policy Today For: " + premium);
		referenceNumber = name.toUpperCase().substring(0, 2) + age
				+ name.toUpperCase().substring(name.length() - 2, name.length()) + zipcode+education.toUpperCase().replace(" ","");

		System.out.println("Reference number: " + referenceNumber);
	}
}
