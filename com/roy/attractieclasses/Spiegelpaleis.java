package Kermis.com.roy.attractieclasses;

public class Spiegelpaleis extends Attractie
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
	
	public Spiegelpaleis()
	{
		naam = "Spiegelpaleis";
		prijs = 2.75d;
		oppervlakte = 50;
	}
	
	
	public void draaien()
	{
		System.out.println("Wij draaien rond in het Spiegelpaleis");
		omzet += prijs;
		kaartjesVerkocht++;
	}
}
