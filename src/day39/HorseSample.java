package day39;

public class HorseSample {

	public static void main(String[] args) {
		System.out.println(at3("longword","foo"));
	}
	
	
	public static String at3(String target,String word){
		String str = target.substring(0, 3);
		str+=word;
		str+=target.substring(3);
		return str;
	}
	}
	
	

