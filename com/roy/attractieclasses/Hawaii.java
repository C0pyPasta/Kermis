package Kermis.com.roy.attractieclasses;

public class Hawaii extends Attractie
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
	
	public Hawaii()
	{
		naam = "Hawaii";
		prijs = 2.90d;
		oppervlakte = 23;
	}
	
	public void draaien()
	{
		System.out.println("Draaien als Hawaii.");
		omzet += prijs;
		kaartjesVerkocht++;
	}
}
