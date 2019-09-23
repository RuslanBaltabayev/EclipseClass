package repl.it;
import java.util.*;

public class Array_Shortest_127 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	String [] splitted = str.split(", ");
	String newstr = "";
	
	int shortest = splitted[0].length();
	int index=0;
	for(int i = 0;i<splitted.length;i++) {
		if(shortest>splitted[i].length()) {
			shortest=splitted[i].length();
			index=i;
			
				}
				
			}
			for(int j =0;j<splitted.length;j++) {
				if(shortest==splitted[j].length()) {
					index=j;
					
					//System.out.println(splitted[index]);
					newstr+=splitted[index]+" ";
					
		}
		
				
}

String [] newarray = newstr.split(" ");
Arrays.sort(newarray);
System.out.println(Arrays.toString(newarray));
}
}
