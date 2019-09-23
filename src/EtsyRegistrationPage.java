
public class EtsyRegistrationPage {

	public static void main(String[] args) {
		
		EtsyAccount e1 = new EtsyAccount();
		e1.setEmail("user1@gmail.com");
		e1.setFirstName("Adam");
		e1.setPassword("adem123");
		
		System.out.println("First name of user1: "+e1.getFirstName());
		
		EtsyAccount e2 = new EtsyAccount();
		e2.setEmail("user2@gmail.com");
		e2.setFirstName("Havva");
		e2.setPassword("havva123");
		
		System.out.println("User2 email is: "+e2.getEmail());
		e2.setEmail(e2.getEmail().replace("gmail", "yahoo"));
		System.out.println("User2 updated email is: "+e2.getEmail());

		EtsyAccount e3 = new EtsyAccount();
		e3.setEmail("user3@gmail.com");
		e3.setFirstName("Habil");
		e3.setPassword("habil");
		
		EtsyAccount e4 = new EtsyAccount();
		e4.setAccount("user4@gmail.com", "kabil", "abc123");
		
		System.out.println(e4.getEmail()+"-"+e4.getFirstName()+"-"+e4.getPassword());;
		System.out.println(e4.getAccount());
		
		
	
	}

}
