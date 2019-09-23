package day22;

public class UsingLoopForSearchingIndex {

	public static void main(String[] args) {
		
		String str = "ABCAADKAB";
		
		int i;
		
		for(i=0;i<str.length();i++) {
			//System.out.print(str.substring(i,i+1)+"-");
			
			if(i!=str.length()-1) {
				System.out.print(str.substring(i,i+1)+"-");
			}else {
				System.out.print(str.substring(i,i+1));
			}
		}
		
		
	}
	
}


