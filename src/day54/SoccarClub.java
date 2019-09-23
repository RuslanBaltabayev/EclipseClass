package day54;

public class SoccarClub {

	int playerCount;
	String name;
	Stadium stadium;

	public SoccarClub(int playerCount, String name, Stadium stadium) {
	
		this.playerCount = playerCount;
		this.name = name;
		this.stadium = stadium;
	}

	public int getPlayerCount() {
		return playerCount;
	}

	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Stadium getStadium() {
		return stadium;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

	@Override
	public String toString() {
		return "SoccarClub [playerCount=" + playerCount + ", name=" + name + ", stadium=" + stadium + "]";
	}
	
	
	
	
}
