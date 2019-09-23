
public class CarMax {

	public static void main(String[] args) {
		
		Car carOne = new Car();
		carOne.setMake("Acura");
		carOne.setModel("ILX");
		carOne.setType("Sedan");
		carOne.setSpeed(35);
		
		System.out.println("Make "+carOne.getMake());
		System.out.println("Current Speed "+carOne.getSpeed());
		carOne.accelerate(30);
		System.out.println("Current Speed "+carOne.getSpeed());
		
		Car carTwo = new Car();
		System.out.println(carTwo.getMake());
		System.out.println(carTwo.getModel());
		System.out.println(carTwo.getType());
		
		Car carThree = new Car("SUV","Audi","SQ5");
		
	}

}
