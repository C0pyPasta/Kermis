package Kermis.com.roy.attractieclasses;

public class Spookhuis extends Attractie
{
	public String naam;
	public double prijs;
	public int oppervlakte;
	public double omzet;
	public int kaartjesVerkocht;
	
	public Spookhuis()
	{
		naam = "Spookhuis";
		prijs = 3.20d;
		oppervlakte = 30;
	}
	
	
	public void draaien()
	{
		System.out.println("De spook draait rond in zijn Spookhuis");
	}
}
