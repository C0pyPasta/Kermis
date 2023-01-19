package Kermis.com.roy.attractieclasses;

public class Botsauto extends Attractie
{
	private String naam;
	private double prijs;
	private int oppervlakte;
	private static double omzet = 0;
	private static int kaartjesVerkocht = 0;
	
	public double getOmzet()
	{
		return omzet;
	}
	
	public int getKaartjesVerkocht()
	{
		return kaartjesVerkocht;
	}
	
	
	
	public Botsauto()
	{
		naam = "Botsauto";
		prijs = 2.50d;
		oppervlakte = 20;
	}
	
	public void draaien()
	{
		System.out.println("De bots auto's draaien!");
		omzet += prijs;
		kaartjesVerkocht++;
	}
}
