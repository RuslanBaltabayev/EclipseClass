package day23_StringWarmUp_NestedLoop_ArrayIntro;

public class Warmup3 {

	public static void main(String[] args) {
		
		String str = "5 Little Monkey Jumping on The Bed";
		
		 String allLowercaseStr = ""; 
		    for (int i = 0; i < str.length(); i++) {
		      /// storing each character inside variable each
		      // each iteration it will store that char 
		      char each = str.charAt(i); 
		      // checking whether this character at this iteration 
		      // is within the range of a-z
		      if( each >= 'a' && each <= 'z')  {
		        allLowercaseStr += each ;  // add on top of each other
		        //System.out.println("IT'S lowercase : " + each );
		      }
		    }
		    System.out.println( allLowercaseStr);
	}

}
