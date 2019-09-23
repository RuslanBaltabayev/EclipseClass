package day20;

public class Seperator {

	public static void main(String[] args) {
		
		
		 String mix = "Aonline132x";
		    String numberStr = "";  
		    
		    int i = 0 ; 
		    
		    while(i< mix.length()) {
		      
		      char c = mix.charAt(i); 
		      
		      if( c>= 'a' && c<= 'z' ) {
		        System.out.println(c);
		        numberStr = numberStr + c ; 
		      }
		      
		      i++ ; 
		    }
		  System.out.print(  numberStr );
		    
	}

}
