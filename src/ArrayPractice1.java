import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice1 {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] arr = {"no", "yes", "no", "yes","no", "yes","no", "yes","no", "yes","no", "yes"};
        String[] arr2= {"no", "no", "no","no","no","no","no","no","no"};
            
//        
//        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<arr.length;i++ ){
//        	//if(arr[i].equals("no")) {
//        		//arr[i]="yes";
//        	arr[i]=arr[i].replaceAll("no", "yes");
//        	//}
//        	
//        }
//        System.out.println(Arrays.toString(arr));
//        
        //convert to String Arraylist called yesNo 
        //write a method that takes ArrayList, removes all "no"'s and returns same Arraylist
        
        //System.out.println(removeNo(yesNo));
        
        ArrayList<String>yesNo=new ArrayList<String>(Arrays.asList(arr));
        System.out.println(yesNo);
        
        System.out.println(removeNo(yesNo));
       
    }
    public static ArrayList<String> removeNo(ArrayList<String>list) {
    	
    	for(int i=0;i<list.size();i++) {
    		if(list.get(i).equals("no")) {
    			list.remove(i);
    		}
    	}
    	 return list;
    }
   
    //add your removeNo method here

}
