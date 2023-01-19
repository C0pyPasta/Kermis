package Kermis.com.roy.attractieclasses;

import Kermis.com.roy.interfaces.*;

public class Spin extends Attractie implements GokAttractie
{
	private String naam;
	private double prijs;
	private int oppervlakte;
	private static double omzet = 0;
	private static int kaartjesVerkocht = 0;
	private int draaiLimiet = 5;
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
	
	public Spin()
	{
		naam = "Spin";
		prijs = 2.25d;
		oppervlakte = 1;
		opstellingsKeuring();
	}
	
	public void draaien()
	{
		if(draaiLimiet >= 1)
		{
			--draaiLimiet;
			
			System.out.println("De Spin draait!");
			omzet += prijs;
			kaartjesVerkocht++;
		}
		else
		{
			onderhoudsbeurt();
		}
		
	}
	
	public void opstellingsKeuring()
	{
		System.out.println("De Spin attractie is goedgekeurd.");
		System.out.println(" ");
	}
	
	private void onderhoudsbeurt()
	{
		System.out.println("Sorry, maar de attractie is tijdelijk gesloten!");
		System.out.println("Het is tijd voor een onderhoudsbeurt.");
		System.out.println("Fix..Fix..Fix..Fix..Fix..");
		System.out.println("Onderhoudsbeurt is klaar!");
		draaiLimiet = 5;
	}
	
	public static void kansSpelBelastingBetalen() 
	{
		belasting = (omzet / 100) * 30;
	}
}
