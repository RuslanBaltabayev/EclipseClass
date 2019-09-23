package day50;

public class StudentUser extends SlackUser {
	int groupNumber;

	public StudentUser(String displayName, int timeZone, String status, int groupNumber) {
		this.displayName=displayName;
		this.timeZone=timeZone;
		this.status=status;
		this.groupNumber = groupNumber;
	}

	@Override
	public String toString() {
		return "StudentUser [groupNumber=" + groupNumber + ", displayName=" + displayName + ", timeZone=" + timeZone
				+ ", status=" + status +  "]";
	}
	public void displayGroup() {
		System.out.println(displayName+" is member of group "+groupNumber);
	}
	
	

}
