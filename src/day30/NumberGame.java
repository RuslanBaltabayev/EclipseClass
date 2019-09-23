package day30;

public class NumberGame {

	public static void main(String[] args) {
		
		
		int i=17;
		printDoubledNumber(10);
		printDoubledNumber(3);
		checkForAge(21);
		checkForAge(i);
	}

	public static void printDoubledNumber(int num) {
		
		
		int doubledNum =num*2;
		System.out.println(num+" was doubled ---> "+doubledNum);
		
	}
	
	public static void checkForAge(int age) {
		
		if(age>18) {
			System.out.println("adult");
		}else {
			System.out.println("not a adult");
		}
	}
	
	
}
