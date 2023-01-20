package Kermis.com.roy;

import java.util.Scanner;
import Kermis.com.roy.attractieclasses.*;
import Kermis.com.roy.centraal.*;

public class Applicatie 
{
	Botsauto bots = new Botsauto("Botsauto", 2.50d, 20);
	Spin spin = new Spin("Spin", 2.25d, 1);
	Spiegelpaleis spiegel = new Spiegelpaleis("Spiegelpaleis", 2.75d, 50);
	Spookhuis spook = new Spookhuis("Spookhuis", 3.20d, 42);
	Hawaii hawaii = new Hawaii("Hawaii", 2.90d, 23);
	Ladderklimmen ladder = new Ladderklimmen("Ladderklimmen", 5.0d, 1);
	
	Kassa kassa = new Kassa(bots, spin, spiegel, spook, hawaii, ladder);
	
	static String keuze;
	static boolean programRunning = true;
	
	static int rondjesVoorBelastingInspecteur = 0;
	
	
	public static void main(String[] args)
	{
		Applicatie app = new Applicatie();
		app.Herhaling();
		
		
	}
	
	private void Herhaling()
	{
		Scanner scanner = new Scanner(System.in);
		
		while(programRunning)
		{
			if(rondjesVoorBelastingInspecteur >= 15)
			{
				BelastingInspecteur belastingInspecteur = new BelastingInspecteur(spin, ladder);
				Kassa.aantalKeerDatBelastingInspecteurIsLangsGeweest++;
				belastingInspecteur.CheckGokAttractie();
				
				rondjesVoorBelastingInspecteur = 0;
			}
			
			
			Menu();
			keuze = scanner.next();
			Keuze(keuze);


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
				System.out.println("Het programma is gestopt...");
				System.exit(0);
				break;
		}
		
		rondjesVoorBelastingInspecteur++;

	}
}
