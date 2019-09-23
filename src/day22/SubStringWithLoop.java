package day22;

public class SubStringWithLoop {

	public static void main(String[] args) {

		String str = "ABCDEFGH";
		
		int i;
		
		for(i=0;i<str.length();i=i+2) {
			
			System.out.print(str.substring(i,i+2)+" ");
			
			
	}
	
}
}

