package Kermis.com.roy.attractieclasses;

public class Spin extends Attractie
{
	public String naam;
	public double prijs;
	public int oppervlakte;
	public double omzet;
	public int kaartjesVerkocht;
	
	public Spin()
	{
		naam = "Spin";
		prijs = 2.25d;
		oppervlakte = 1;
	}
	
	public void draaien()
	{
		System.out.println("De Spin draait!");
	}
}