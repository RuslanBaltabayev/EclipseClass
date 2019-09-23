package day57;

public interface Edible {

	void eat();
}
interface Drinkible extends Edible{
	
	void drink();
}
class IceCoffee implements Drinkible{
	
	int size;
	
	public IceCoffee() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
	
}
class Burger implements Edible{
	
	String name ;
	int size;
	
	public Burger() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

	

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
