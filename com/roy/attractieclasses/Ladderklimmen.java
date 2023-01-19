package Kermis.com.roy.attractieclasses;

public class Ladderklimmen extends Attractie
{
	public String naam;
	public double prijs;
	public int oppervlakte;
	public double omzet;
	public int kaartjesVerkocht;
	
	public double getOmzet()
	{
		return omzet;
	}
	
	public int getKaartjesVerkocht()
	{
		return kaartjesVerkocht;
	}
	
	public Ladderklimmen()
	{
		naam = "Ladderklimmen";
		prijs = 5.0d;
		oppervlakte = 1;
		omzet = 0;
		kaartjesVerkocht = 0;
	}
	
	public void draaien()
	{
		System.out.println("Ik draai ondersteboven tijdens het ladderklimmen");
		omzet += prijs;
		kaartjesVerkocht++;
	}
}
