package day49;

public class Bike {

	private String brand;
	private int gear;
	private int speed;
	private int id;
	
	private static int countOfBike;
	
	private Bike() {
		System.out.println("no arg is being called");
		++countOfBike;
		this.id = countOfBike;
	}

	public Bike(String brand, int gear, int speed) {
		this();
		this.brand = brand;
		this.gear = gear;
		this.speed = speed;
	
	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getId() {
		return id;
	}

	
	public int speedUp(int increaseBy) {
		speed+=increaseBy;
		return speed;
	}
	public int slowdown(int decreaseBy) {
		speed-=decreaseBy;
		return speed;
	}
	
	public static void showCurrentCount() {
		System.out.println("Current Count of Object is "+countOfBike);
	}

	public String toString() {
	    return "Bike [brand=" + brand + ", gear=" + gear + ", speed=" + speed + ", id=" + id + "]";
	  }

	public static void resetCount() {
		countOfBike=0;
	}

}
