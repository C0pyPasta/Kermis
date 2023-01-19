package Kermis.com.roy.attractieclasses;

public class Hawaii extends Attractie
{
	public String naam;
	public double prijs;
	public int oppervlakte;
	public double omzet;
	public int kaartjesVerkocht;
	
	public Hawaii()
	{
		naam = "Hawaii";
		prijs = 2.90d;
		oppervlakte = 23;
	}
	
	public void draaien()
	{
		System.out.println("Draaien als Hawaii.");
	}
}
