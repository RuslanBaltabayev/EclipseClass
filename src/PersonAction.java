
public class PersonAction {

	public static void main(String[] args) {
		
		 Person p1 = new Person("Ganisher", 6.1f,'M');
		 System.out.println(p1.count);
		 Person p2 = new Person("Mavlida", 5.3f,'F');
		 System.out.println(p2.count);
		 Person p3 = new Person("Manzire",5.3f,'F');
		 System.out.println(p3.count);
		    
		    // static way to access static variable 
		    System.out.println( Person.race );
		    // non static way to access static variable 
		    // highly not recommended
		    System.out.println( p1.race);
		    
		    Person.race = "Humanoid";
		    System.out.println(p2.race);
		    
		    p2.race = "Spartan" ; 
		    System.out.println(p1.race);
	}

}
