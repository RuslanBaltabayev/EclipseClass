
public class PhoneClass {
	
	String brand;
	String model;
	String OS;
	int storageSize;
	double screenSize;
	int ram;
	int camera;
	double price;
	String color;
	boolean isWaterResistant;
	boolean isSupports5G;
	String cpu;
	long imei;
	
	public void call() {
		System.out.println("Phone is calling");
	}
	
	public void ring() {
		System.out.println("Phone is ringing");
	}
	
	public void dila(long phoneNumber) {
		System.out.println("Dialing..."+phoneNumber);
	}
	
	public void sms(String sms, long phoneNumber) {
		
	}

}
