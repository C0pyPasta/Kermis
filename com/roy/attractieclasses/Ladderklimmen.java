package Kermis.com.roy.attractieclasses;

import Kermis.com.roy.interfaces.*;

public class Ladderklimmen extends Attractie implements IBelasting
{
	private String naam;
	private double prijs;
	private int oppervlakte;
	private static double omzet = 0;
	private static int kaartjesVerkocht = 0;
	private double belasting;
	
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
	}
	
	public void draaien()
	{
		System.out.println("Ik draai ondersteboven tijdens het ladderklimmen");
		omzet += prijs;
		kaartjesVerkocht++;
	}
	
	public void kansSpelBelastingBetalen()
	{
		belasting = (omzet / 100) * 30;
	}
}
