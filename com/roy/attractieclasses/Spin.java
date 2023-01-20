package Kermis.com.roy.attractieclasses;

import Kermis.com.roy.interfaces.*;

public class Spin extends Attractie implements GokAttractie
{
	private int draaiLimiet = 5;
	private static double belasting = 0;
	
	
	public double getBelasting()
	{
		return belasting;
	}
	
	public void setBelasting()
	{
		belasting = 0;
	}
	
	public Spin(String naam, double prijs, int oppervlakte)
	{
		setNaam(naam);
		setPrijs(prijs);
		setOppervlakte(oppervlakte);
		opstellingsKeuring();
	}
	
	public void draaien()
	{
		if(draaiLimiet >= 1)
		{
			--draaiLimiet;
			
			System.out.println("De Spin draait!");
			setOmzet(getOmzet() + getPrijs());
			setKaartjesVerkocht(getKaartjesVerkocht() + 1);
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
	
	public void kansSpelBelastingBetalen() 
	{
		belasting = (getOmzet() / 100) * 30;
	}
}
