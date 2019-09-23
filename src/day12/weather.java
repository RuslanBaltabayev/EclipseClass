package day12;

import java.util.Scanner;

public class weather {

	public static void main(String[] args) {
		
		String weather,action;
		
		Scanner s = new Scanner(System.in);
		System.out.println("how is the weather today?");
		weather = s.next();
		
		action = (weather.equals("sunny")||weather.equals("nice")||weather.equals("warm")) ? "go out":"stay home";
		
		System.out.println("You need to "+ action);
	}

}
