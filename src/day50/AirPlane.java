package day50;

import examples.Vehicle;

public class AirPlane extends Vehicle {
	
	private int wingCount;

	public int getWithCount() {
		return wingCount;
	}

	public void setWithCount(int wingCount) {
		this.wingCount = wingCount;
	}

	public AirPlane(String brand, String model, int year, int withCount) {
		super(brand, model, year);
		this.wingCount = withCount;
	}

	@Override
	public String toString() {
		return "AirPlane [withCount=" + wingCount 
				+ ", year=" + year
				+ ", brand" + getBrand() 
				+ ", model" + getModel() 
				 + ", toString()=" + super.toString() + "]";
	}

	

}
