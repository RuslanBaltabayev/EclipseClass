package day20;

public class Counter {

	public static void main(String[] args) {

		
		String str = "jaaaava";
		
		int count = 0;
		int x = 0;
		
		do {
			char c = str.charAt(x);
			if(c=='a') {
				System.out.println("BINGO");
				count++;
			}
		x++;
		}while(x<str.length());
		
		
		
		System.out.println(count);
	}

}
