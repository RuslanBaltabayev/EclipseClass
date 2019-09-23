package day27;

import java.util.Arrays;

public class ArrayCopyOf {

	public static void main(String[] args) {
		
		String[] dcComicHeros = {"Superman",
	            "Batman",
	            "Aquaman",
	            "Wonder Woman",
	            "The Flash"
	            ,"Green Lantern"
	          } ;  
	    
	    System.out.println( Arrays.toString( dcComicHeros) );
	    
	    Arrays.sort(dcComicHeros);
	    
	    System.out.println(Arrays.toString( dcComicHeros) );
	    
	    for (String hero : dcComicHeros) {
	    	
			System.out.println(hero);
		}
	    
	    
	}

}
