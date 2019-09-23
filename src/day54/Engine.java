package day54;

public class Engine {

	final String engineType;
	final int cilinderCount;
	
	public Engine(String engineType, int cilinderCount) {
		
		this.engineType = engineType;
		this.cilinderCount = cilinderCount;
	}
	
	public void start() {
		System.out.println("Engine type <"+engineType+"> with cilinder count <"+cilinderCount+"> is starting");
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + ", cilinderCount=" + cilinderCount + "]";
	}
	
	
	
}
