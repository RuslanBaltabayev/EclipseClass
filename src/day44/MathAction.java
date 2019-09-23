package day44;

import java.util.Arrays;

public class MathAction {

	public static void main(String[] args) {
		
		MathEquation math1 = new MathEquation('+',120,12);
		MathEquation math2 = new MathEquation('-',143,76);
		MathEquation math3 = new MathEquation('*',4,5);
		MathEquation math4 = new MathEquation('/',110,11);
		
		MathEquation[]arr= {math1,math2,math3,math4};
		
		for (MathEquation each : arr) {
			each.calculate();
			System.out.println(each.getOprand());
			System.out.println(each);
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
