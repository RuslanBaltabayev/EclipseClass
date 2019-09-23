
public class EtsyAccount {

	private String email;
	private String firstName;
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.length()<6)
			System.out.println("Password Must be at least 6 character!");
		this.password = password;
	}
	
	public void setAccount(String email,String firstName,String password) {
		this.email = email;
		this.firstName = firstName;
		setPassword(password);
	}
	public String getAccount() {
		String str = this.email+"-"+this.firstName+"-"+this.password;
		return str;
	}
}
