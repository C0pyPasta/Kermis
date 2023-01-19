package Kermis.com.roy;

import java.util.Scanner;
import Kermis.com.roy.attractieclasses.*;

public class Applicatie 
{
	Botsauto bots = new Botsauto();
	Spin spin = new Spin();
	Spiegelpaleis spiegel = new Spiegelpaleis();
	Spookhuis spook = new Spookhuis();
	Hawaii hawaii = new Hawaii();
	Ladderklimmen ladder = new Ladderklimmen();
	
	
	public static void main(String[] args)
	{
		Applicatie app = new Applicatie();
		Scanner scanner = new Scanner(System.in);
		Menu();
		
		int num = scanner.nextInt();
		app.Keuze(num);
	}
	
	private static void Menu()
	{
		System.out.println("Maak een keuze:");
		System.out.println("");
		System.out.println("1: Botsauto's");
		System.out.println("2: Spin");
		System.out.println("3: Spiegelpaleis");
		System.out.println("4: Spookhuis");
		System.out.println("5: Hawaii");
		System.out.println("6: Ladderklimmen");
	}
	
	private void Keuze(int num)
	{
		switch(num)
		{
			case 1:
				bots.draaien();
				break;
			case 2:
				spin.draaien();
				break;
			case 3:
				spiegel.draaien();
				break;
			case 4:
				spook.draaien();
				break;
			case 5:
				hawaii.draaien();
				break;
			case 6:
				ladder.draaien();
				break;
		}
	}
}
