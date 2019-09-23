package day9;

//import java.util.Scanner;

public class MultiBranchIfStatementIntro {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		
		int score = 84;
		
		if (score>=90) {
			System.out.println("A");
		}else if(score<90&&score>=80) {
			System.out.println("B");
		}else 
			System.out.println("D");
		
	}

}
