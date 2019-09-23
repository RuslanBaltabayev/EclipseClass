package repl.it;

import java.util.*;

public class Assesment4_2 {

	 public String printList(ArrayList<ArrayList<String>> nestedList) 
	  {
	    String string = "";
	    for(int m =0;m<nestedList.size();m++ ){
	      for(int n =0;n<nestedList.size();n++){
	        string+=nestedList.get(m).get(n);
	      }
	    
	    }
	    
	    
	    return string;
	   
	  }
	  public static void main(String[] args)
	  {
		  Assesment4_2 m = new Assesment4_2();
	    ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
	    arr.add(new ArrayList<String>());
	    arr.add(new ArrayList<String>());
	    String[] strs = new String[]{"a","a","b"};
	    Collections.addAll(arr.get(0),strs);
	    
	    strs = new String[]{"z","z","z"};
	    Collections.addAll(arr.get(1),strs);
	    
	    
	    System.out.print(m.printList(arr));
	   
	    
	  }

}
