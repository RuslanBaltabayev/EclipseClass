package day54;

public class SuperCar {

	final String model;
	final String make;
	final Engine engine;
	
	public SuperCar(String model, String make, Engine engine) {
		
		this.model = model;
		this.make = make;
		this.engine = engine;
	}
	
	public void start() {
		//engine.start();
		System.out.println("Super Car Make " + make + " Model : " + model + " with engine cilinder count ");
	}
	public static void main(String[] args) {
		Engine e1 = new Engine("Turbo",8);
		System.out.println(e1.engineType);
		System.out.println(e1.cilinderCount);
		System.out.println(e1.toString());
		e1.start();
		
		SuperCar spartan = new SuperCar("SpartanHorse", "Cybertek", e1);
		System.out.println(spartan);
		spartan.start();
	}
	
	
	
	
}
