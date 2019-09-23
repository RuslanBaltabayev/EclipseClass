package repl.it;

import java.util.Scanner;

public class LaptopConfigurator {

	public static void main(String[] args) {
	
		double price = 0;
		String storageType, screenType, cpu;
		int ram = 0 ;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Select screen size:");
		double screensize = scan.nextDouble();
		
		if (screensize==13.3) {
			price+=200;
		}else if(screensize==15) {
			price+=300;
		}else if(screensize==17.3) {
			price+=400;
		}
		
		System.out.println("Select CPU type:");
		cpu = scan.next();
		
		if(cpu.equals("i3")) {
			price+=150;
		}else if(cpu.contentEquals("i5")) {
			price+=250;
		}else if(cpu.equals("i7")) {
			price+=350;
		}
		
		System.out.println("Select RAM size:");
		ram = scan.nextInt();
		price= price+ram/4*50;
		
		System.out.println("Select storage type:");
		storageType = scan.next();
		
		System.out.println("Enter memory size:");
		int memorysize = scan.nextInt();
		
	if(storageType.equalsIgnoreCase("hdd")){
			price = price +memorysize/10;
		}
	if(storageType.equalsIgnoreCase("ssd")){
		price = price +memorysize/5;
	}
	
		
		System.out.println("Enter screen resolution:");
		screenType = scan.next();
	if(screenType.equalsIgnoreCase("FULLHD")) 
		price = price+100;
	if(screenType.equalsIgnoreCase("4K")) 
		price = price+200;
		
		
		System.out.println("Laptop price is: "+price+"$");
		
	}

}
