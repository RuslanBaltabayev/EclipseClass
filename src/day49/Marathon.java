package day49;

import java.util.ArrayList;
import java.util.Arrays;

public class Marathon {

	public static void main(String[] args) {
		
		Bike b1 = new Bike("Kawasaki",4,80);
		Bike b2 = new Bike("Ducati", 5, 90);
		Bike b3 = new Bike("Yamaha", 4, 88);
		Bike b4 = new Bike("Harley-Davidson", 3, 70);
		
		Bike.showCurrentCount();
		
		ArrayList<Bike>allBikes=new ArrayList<>(Arrays.asList(b1,b2,b3));
	
		for (int i = 0; i < allBikes.size(); i++) {
		      System.out.println( allBikes.get(i)  );
		    }
		    System.out.println("--------------------------");
		    for( Bike each : allBikes) {  
		      
		      //System.out.println(each);
		      System.out.println(  each.getId()  +" ---" +  each.getBrand()   );
		      each.speedUp(10);
		      System.out.println( each.toString() );
		      
		    }
		    System.out.println("--------------------------");
		    
		    b1.speedUp(10);
		    System.out.println( b1.getSpeed());
//		    b2.speedUp(10);
//		    b3.speedUp(10);
//		    b4.speedUp(10);
		//    
		    
		    Bike.showCurrentCount(); //-->> Bike count is 4 now
		    
		    Bike.resetCount();
		    Bike.showCurrentCount(); //-->> Bike count is 4 now
		    
		    Bike b5 = new Bike("Yamaha", 4, 88);
		    System.out.println("current id of b5 is " + b5.getId());
		    Bike b6 = new Bike("Harley-Davidson", 3, 70);  
		    System.out.println("current id of b6 is " + b6.getId());
		    Bike.showCurrentCount(); //-->> Bike count is 4 now
	}

}
