package day40;

public class Phone {

	String attribute;
	String OS;
	int capacity;
	
	public void ring() {
		System.out.println("ringing");
	}
	
	public void dial(long number) {
		System.out.println("dialing"+number);
	}
	
	public void displayAttribute() {
		System.out.println("Brand "+attribute);
	}
}

