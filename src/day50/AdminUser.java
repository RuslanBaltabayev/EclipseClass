package day50;

public class AdminUser extends SlackUser {
	
	int adminLevel;

	public AdminUser(String displayName, int timeZone, String status, int adminLevel) {
		super(displayName, timeZone, status);
		this.adminLevel = adminLevel;
	}

	@Override
	public String toString() {
		return "AdminUser [adminLevel=" + adminLevel + ", displayName=" + displayName + ", timeZone=" + timeZone
				+ ", status=" + status + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



}
