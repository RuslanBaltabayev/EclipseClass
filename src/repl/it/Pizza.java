package repl.it;
public class Pizza {

	private String size;
	private int cheese;
	private int pepperoni;
	private int ham;
	
	public Pizza() {
		this.size = "";
		this.cheese = 0;
		this.pepperoni = 0;
		this.ham = 0;
	}
	
	
	public  Pizza(String size,int cheese,int pepperoni,int ham){
	  this.size=size;
	  this.cheese=cheese;
	  this.pepperoni=pepperoni;
	  this.ham=ham;
	}
	public String getSize(){
	  return size;
	}
	public void setSize(){
	  this.size=size;
	}
	public int getCheese(){
	  return cheese;
	}
	public void setCheese(){
	  this.cheese=cheese;
	}
	public int getPepperoni(){
	  return pepperoni;
	}
	public void setPepperoni(){
	  this.pepperoni=pepperoni;
	}
	public int getHam(){
	  return ham;
	}
	public void setHam(){
	  this.ham=ham;
	}
	public double calcCost(){
	 
	  if(size.equalsIgnoreCase("small"))
	  return 10+(cheese+pepperoni+ham)*2;
	  else if(size.equalsIgnoreCase("medium"))
	  return 12+(cheese+pepperoni+ham)*2;	  
	  else if(size.equalsIgnoreCase("large"))
	  return 14+(cheese+pepperoni+ham)*2;
	  else
	  return 0.0;
	  
	}
	public String getDescription(){
	

		 return size +" Pizza with " + cheese + " Cheese toppings, "+  pepperoni+" Pepperoni toppings, and "+
			+ ham + " Ham toppings."	+ "\nTotal Price: " + calcCost();
	}
  
	
}
