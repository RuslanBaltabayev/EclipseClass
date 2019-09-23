package day19;

public class appreverse {

	public static void main(String[] args) {
		
		String app = "app" ; 
	    String reversedApp = "";
	    

	    
	    int x = 2; 
	    
	    while(x>=0) {
	    
	    //  System.out.println( x );
	      reversedApp = reversedApp + app.charAt(x) ; 
	      System.out.println(reversedApp);
	      
	      x-- ; 
	    
	    }
	    System.out.println("final value of reversed word is " + reversedApp);
	}

}
