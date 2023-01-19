package Kermis.com.roy.attractieclasses;

public class Spin extends Attractie
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
	
	public Spin()
	{
		naam = "Spin";
		prijs = 2.25d;
		oppervlakte = 1;
	}
	
	public void draaien()
	{
		System.out.println("De Spin draait!");
		omzet += prijs;
		kaartjesVerkocht++;
	}
}
