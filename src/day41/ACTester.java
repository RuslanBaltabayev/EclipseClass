package day41;

public class ACTester {

	public static void main(String[] args) {
		
		AirConditioner ac = new AirConditioner();
		ac.brand="Samsung";
		ac.currentTemp=79.7f;
		ac.isOn=true;
		
		ac.displayTheBrand();
		ac.displayAllInfo();
		
		ac.turnOff();
		ac.turnOn();
		ac.showCurrentTemp();
		ac.increaseTemp(10);
		
	}

}
