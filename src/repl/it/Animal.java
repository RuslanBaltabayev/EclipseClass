package repl.it;

public abstract class Animal {

	private String name;
	private int age;
	
	public  String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract int getAgeInHumanYears(int age);
	
	public Animal(String name,int age) {
		
		this.name=name;
		this.age=age;
		
	}
	@Override
	public String toString() {
		return "Animal [name=" + getName() + ", age=" + getAge() + "]";
	}
	
	
	
}
class Dog extends Animal{
	private String breed;
	private int humanYears;
	
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getHumanYears() {
		return humanYears;
	}
	public void setHumanYears(int humanYears) {
		this.humanYears = humanYears;
	}
	public Dog(String name,int age,String breed) {
		super(name,age);
		this.breed=breed;
			}
	public int getAgeInHumanYears(int age) {
		if(getAge()<=2)
			this.humanYears=getAge()*11;
		else 
			this.humanYears=22+((getAge()-2)*5);
		return this.humanYears;
	}
	@Override
	public String toString() {
		return "Name: " + super.getName()+"\n"
		+ "Breed: " + getBreed()+"\n" 
		+"Age in calendar years: " + super.getAge()+"\n"
		+"Age in human years: " + this.getAgeInHumanYears(getHumanYears());
	}
	
	public boolean equals(Dog alabay) {
		if(this.getName().equals(alabay.getName())&&this.getAge()==alabay.getAge()&&this.getBreed().equals(alabay.getBreed()))
			return true;
		else
			return false;
	}
	
	

	
}