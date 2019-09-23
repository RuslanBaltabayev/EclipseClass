package day54;

public class FavoriteSoccerClub {

	public static void main(String[] args) {
		
		Stadium st = new Stadium(100000, "Burger");
		System.out.println(st);
		SoccarClub GS = new SoccarClub(25, "GalataSaray", st);
		System.out.println(GS);

	}

}
