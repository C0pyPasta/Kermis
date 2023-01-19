package Kermis.com.roy.attractieclasses;

public class Spiegelpaleis extends Attractie
{
	public String naam;
	public double prijs;
	public int oppervlakte;
	public double omzet;
	public int kaartjesVerkocht;
	
	public Spiegelpaleis()
	{
		naam = "Spiegelpaleis";
		prijs = 2.75d;
		oppervlakte = 50;
	}
	
	
	public void draaien()
	{
		System.out.println("Wij draaien rond in het Spiegelpaleis");
	}
}
