package day32;

import java.util.Scanner;

public class Utility {

	public static void main(String[] args) {

		double inch = FeetToInch(10);
		System.out.println(meterToCM(5));
		System.out.println(inch);
		System.out.println(FahToCel(80));
	}
	
	public static int meterToCM(int meter) {
		
		return meter*=100;
	}
	
	public static int FeetToInch(int Feet) {
		return Feet*=12;
	}
	
	public static double FahToCel(double fahr) {
		return 5.0/9*(fahr-32);
	}
}
