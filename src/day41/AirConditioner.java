package day41;

public class AirConditioner {
	
	String brand;
	float currentTemp;
	boolean isOn;
	
	public void displayTheBrand() {
		System.out.println("The Brand is "+brand);
	}
	public void showCurrentTemp() {
		System.out.println("Current temperature is "+currentTemp);
	}
	public void displayAllInfo() {

		System.out.println("Brand is "+brand+" | The current temp is "+currentTemp+" | Is AC on? "+isOn);
		
		}
	public void turnOn() {
		System.out.println("current ac status "+isOn);
		if(isOn==false)
		isOn=true;
		else
			System.out.println("It is alredy on!!!");
	}
	public void turnOff() {
		if(isOn==true) {
			isOn=false;
			System.out.println("It has been turned off!!");
		}
			
		else
			System.out.println("It is already turned off!!!");
	}
	public void increaseTemp(int increaseBy) {
		currentTemp+=increaseBy;
	}
	public void decreaseTemp(int decreaseBy) {
		currentTemp-=decreaseBy;
	}
	public void setTemperature(float targetTemperature) {
		currentTemp=targetTemperature;
	}

}
