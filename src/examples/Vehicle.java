package examples;

public class Vehicle {

	private String brand;
	private String model;
	protected int year;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public Vehicle(String brand, String model, int year) {

		this.brand = brand;
		this.model = model;
		this.year = year;
		
	}
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", year=" + year + "]";
	}

	
}
