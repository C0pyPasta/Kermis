package Kermis.com.roy.attractieclasses;

import Kermis.com.roy.interfaces.*;

public class Ladderklimmen extends Attractie implements GokAttractie
{
	private String naam;
	private double prijs;
	private int oppervlakte;
	private static double omzet = 0;
	private static int kaartjesVerkocht = 0;
	private static double belasting = 0;
	
	public static double getOmzet()
	{
		return omzet;
	}
	
	public static int getKaartjesVerkocht()
	{
		return kaartjesVerkocht;
	}
	
	public static double getBelasting()
	{
		return belasting;
	}
	
	public static void setBelasting()
	{
		belasting = 0;
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
	
	public static void kansSpelBelastingBetalen()
	{
		belasting = (omzet / 100) * 30;
	}
}
