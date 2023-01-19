package Kermis.com.roy;

import java.util.Scanner;
import Kermis.com.roy.attractieclasses.*;
import Kermis.centraal.*;

public class Applicatie 
{
	Kassa kassa = new Kassa();
	
	Botsauto bots = new Botsauto();
	Spin spin = new Spin();
	Spiegelpaleis spiegel = new Spiegelpaleis();
	Spookhuis spook = new Spookhuis();
	Hawaii hawaii = new Hawaii();
	Ladderklimmen ladder = new Ladderklimmen();
	
	static String keuze;
	static boolean programRunning = true;
	
	
	public static void main(String[] args)
	{
		Applicatie app = new Applicatie();
		Scanner scanner = new Scanner(System.in);
		
		
		while(programRunning)
		{
			Menu();
			keuze = scanner.next();
			app.Keuze(keuze);


			System.out.println(" ");
			System.out.println("=============================================================");
			System.out.println(" ");
			
			System.out.println("Wilt u nog een keuze maken? y/n");
			keuze = scanner.next().toLowerCase();
			if(keuze.equals("y"))
			{
				System.out.println(" ");
				System.out.println("=============================================================");
				System.out.println(" ");
			}
			else
			{
				System.out.println("Het programma is gestopt...");
				programRunning = false;
				System.exit(0);
			}
		}
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
		System.out.println("O: Totaal omzet hele kermis.");
		System.out.println("k: Aantal verkochte kaartjes per attractie, en totaal");
		System.out.println("Q: stopt het programma.");
		System.out.println("=============================================================");
	}
	
	private void Keuze(String keuze)
	{
		switch(keuze.toLowerCase())
		{
			case "1":
				bots.draaien();
				break;
			case "2":
				spin.draaien();
				break;
			case "3":
				spiegel.draaien();
				break;
			case "4":
				spook.draaien();
				break;
			case "5":
				hawaii.draaien();
				break;
			case "6":
				ladder.draaien();
				break;
			case "o":
				kassa.TotaalOmzetKermis();
				break;
			case "k":
				kassa.Kaartjes();
				break;
			case "q":
				System.exit(0);
				break;
		}
		

	}
}
