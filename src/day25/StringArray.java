package day25;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		
		String[]movies=new String [4];
		
		movies[0]="Life";
		movies[1]="without";
		movies[2]="love is";
		movies[3]="meaningless";
		
		System.out.println(Arrays.toString(movies));
		System.out.println(movies.length);
		System.out.println(movies[0]);
		System.out.println(movies[0].length());
		
		
	}

}
