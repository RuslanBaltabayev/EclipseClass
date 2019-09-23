package repl.it;

import java.util.Scanner;

public class ParseHtml {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String html =scan.nextLine();
	
		int x = html.indexOf("id");
		int y = html.indexOf('"',x+4);
		int i = 0;
		
		
			for(i = 0;i<1;i++);{
				
					 if(html.indexOf("<html>")>-1) {
						 System.out.println(html.substring(x+4,y));
					 }else {
						 System.out.println("Invalid input!");
					 }
					
		
			
		}
			
		
	
		
	}
	
		
	
}
