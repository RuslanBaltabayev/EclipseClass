package examples;

import java.util.Arrays;

public class Array_Swap {

	public static void main(String[] args) {
		
		String str = "Java is a very important class";
		
		String [] str2 = str.split(" ");
		int len = str2.length - 1;
		
		for (int i = 0; i < str2.length/2; i++) {
			String temp = str2[i];
			str2[i] = str2[len - i];
			str2[len -i] =  temp;
		}
		System.out.println(Arrays.toString(str2) + " ");
		
		for( String str3 :   str2    ) {
			
			System.out.print(str3 + " ");
			
		}
	}

}
