package day61;

import java.util.ArrayList;
import java.util.List;

public abstract class Electronic {

  public abstract void turnOn();

  public static void main(String[] args) {

    /*
     * create List of Electronic with random 10 items turn them all on
     * 
     * find out how many computer and how many AirConditioner are there
     * 
     */
    List<Electronic> allItems = new ArrayList<>() ; 
    
//    Electronic item1 = new Computer();
//    Electronic item2 = new AirConditioner();
//    Electronic item3 = new Computer();
//    Electronic item4 = new Computer();
//    Electronic item5 = new Computer();
//    Electronic item6 = new AirConditioner();
//    Electronic item7 = new Computer();
//    Electronic item8 = new Computer();
    
    allItems.add(new AirConditioner());
    allItems.add(new Computer());
    allItems.add(new Computer());
    allItems.add(new Computer());
    allItems.add(new AirConditioner());
    allItems.add(new Computer());
    allItems.add(new AirConditioner());
    allItems.add(new Computer());
    allItems.add(new AirConditioner());

    int cntComputer = 0;
    int cntAC = 0;
    
    for(Electronic each : allItems ) {
      
      each.turnOn();
      
      if(each instanceof Computer) {
    	  Computer cp = new Computer();
    	  cp.code();
        cntComputer ++ ;         
      
      }else if(each instanceof AirConditioner ) {
    	  AirConditioner ac = new AirConditioner();
    	  ac.controlTemp();

        cntAC++;
      }
      
    }
    System.out.println( "compurer count : " + cntComputer );
    System.out.println( "AC count : " +  cntAC );
    
    
    
    
    
//    int cntComputer = 0;
//    int cntAC = 0;
//    
//    if(item1 instanceof Computer) {
//    
//      cntComputer ++ ; 
//    
//    }else if(item1 instanceof AirConditioner ) {
//      
//      cntAC ++ ; 
//    }
//    
    
    // Add 1 functionality to each sub classes 
    // add a void method with no return type for each sub classes 
    //    Computer -->>> code()   -->> print coding 
    //    AirConditioner --- >>> controlTemp()  -->> print controlling temp 
      
    // try to call them while looping through above list of Electronic 
    
    

  }

}

class Computer extends Electronic {
  @Override
  public void turnOn() {
    System.out.println("Turning on computer");
  }
  public void code() {
	  System.out.println("print coding");
  }
}

class AirConditioner extends Electronic {

  @Override
  public void turnOn() {
    System.out.println("Turning on AirConditioner");
  }
  public void controlTemp() {
	  System.out.println("print controlling temp");
  }

}
