package day44;

public class MathEquation {
	
	private char oprand;
	private double oprand1;
	private double oprand2;
	private double result;
	

	public char getOprand() {
		return oprand;
	}

	public void setOprand(char oprand) {
		this.oprand = oprand;
	}

	public double getOprand1() {
		return oprand1;
	}

	public void setOprand1(char oprand1) {
		this.oprand1 = oprand1;
	}

	public double getOprand2() {
		return oprand2;
	}

	public void setOprand2(char oprand2) {
		this.oprand2 = oprand2;
	}
	

	public MathEquation() {
		
	}

	public MathEquation(char oprand) {
	
		this.oprand = oprand;
	}

	public MathEquation(char oprand, double oprand1, double oprand2) {
	
		this.oprand = oprand;
		this.oprand1 = oprand1;
		this.oprand2 = oprand2;
	}
	
	public void calculate() {
		switch(oprand) {
		case'+':
			result=oprand1+oprand2;
			break;
		case'-':
			result=oprand1-oprand2;
			break;
		case'*':
			result=oprand1*oprand2;
			break;
		case'/':
			result=oprand1/oprand2;
			break;
		}
		System.out.println(result);
	}
	public String toString() {
		return "MathEquation [oprand=" + oprand + ", oprand1=" + oprand1 + ", oprand2=" + oprand2 + ", result=" + result
				+ "]";
	}
	
	
	

}
