package day62;

public class DangerZone {

	public static void main(String[] args) {
		
		System.out.println("Beginning");
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(i);
			try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("caught");
		}
			
		}
		
		
		
		System.out.println("Ending");
	}

}
