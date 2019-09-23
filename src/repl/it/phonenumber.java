package repl.it;

import java.util.Scanner;

public class phonenumber {

  public static void main(String[] args){
  
   Scanner scan = new Scanner(System.in);
   
  int areaCode,localNumber;
  String phoneNumber;
  
  areaCode =scan.nextInt();
  
  localNumber =scan.nextInt();
  
  phoneNumber ="("+areaCode+")-"+localNumber;
  
  System.out.println("Calling number"+" "+phoneNumber);
  
}
}

	
