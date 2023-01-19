package Kermis.com.roy.attractieclasses;

public class Botsauto extends Attractie
{
	private String naam;
	private double prijs;
	private int oppervlakte;
	private double omzet;
	private int kaartjesVerkocht;
	
	// Getters & Setters maken 
	// zodat Kassa de totaal omzet kan krijgen
	// door van elk object de Getter aan te roepen
	// en die bij elkaar op te tellen.
	
	
	public Botsauto()
	{
		naam = "Botsauto";
		prijs = 2.50d;
		oppervlakte = 20;
		omzet = 0;
		kaartjesVerkocht = 0;
	}
	
	public void draaien()
	{
		System.out.println("De bots auto's draaien!");
		omzet += prijs;
		kaartjesVerkocht++;
		System.out.println(prijs);
		System.out.println(kaartjesVerkocht);
	}
}
