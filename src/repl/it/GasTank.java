package repl.it;

public class GasTank {

	double amount=0;
	double capacity;
	
	public GasTank(double capacity) {
		
		this.capacity = capacity;
	}
	
	public void addGas(double d) {
		if(amount<capacity)
			amount+=d;
		else
			amount=capacity;
	}
	
	public void useGas(double d) {
		if(amount>0)
			amount-=d;
		else
			amount=0;
		
	}
	
	public boolean isEmpty() {
		if(amount<0.1)
			return true;
		else
			return false;
		
	}
	public boolean isFull() {
		if(amount>capacity-0.1)
			return true;
		else
			return false;
		
	}
	public double getGasLevel() {
		return amount;
	}
	public double fiilUp() {
		amount=capacity;
		return capacity-amount;
	}
	
	
}
