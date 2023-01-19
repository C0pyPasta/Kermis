package Kermis.com.roy.attractieclasses;

public class Spookhuis extends Attractie
{
	private String naam;
	private double prijs;
	private int oppervlakte;
	private static double omzet;
	private static int kaartjesVerkocht;
	
	public static double getOmzet()
	{
		return omzet;
	}
	
	public static int getKaartjesVerkocht()
	{
		return kaartjesVerkocht;
	}
	
	public Spookhuis()
	{
		naam = "Spookhuis";
		prijs = 3.20d;
		oppervlakte = 30;
	}
	
	
	public void draaien()
	{
		System.out.println("De spook draait rond in zijn Spookhuis");
		omzet += prijs;
		kaartjesVerkocht++;
	}
}
