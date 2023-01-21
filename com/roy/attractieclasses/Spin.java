package Kermis.com.roy.attractieclasses;

import Kermis.com.roy.interfaces.*;
import Kermis.com.roy.exceptions.*;

public class Spin extends Attractie implements GokAttractie
{
	private static double belasting = 0;
	
	
	public double getBelasting()
	{
		return belasting;
	}
	
	public void setBelasting()
	{
		belasting = 0;
	}
	
	public Spin(String naam, double prijs, int oppervlakte, int draaiLimiet)
	{
		setNaam(naam);
		setPrijs(prijs);
		setOppervlakte(oppervlakte);
		setDraaiLimiet(draaiLimiet);
		opstellingsKeuring();
	}
	
	public void draaien() throws KaartjesExceptions
	{
		if(getDraaiLimiet() > 0)
		{
			setDraaiLimiet(getDraaiLimiet() - 1);
			
			System.out.println("De Spin draait!");
			setOmzet(getOmzet() + getPrijs());
			setKaartjesVerkocht(getKaartjesVerkocht() + 1);
		}
		else
		{
			onderhoudsbeurt();
		}
		
		
		if(getKaartjesVerkocht() == 6)
		{
			setKaartjesVerkocht(6);
			// throw een Exception
			throw new KaartjesExceptions(6);
		}
		else if(getKaartjesVerkocht() == 11)
		{
			// throw een Exception
			throw new KaartjesExceptions(11);
		}
		
	}
	
	public void opstellingsKeuring()
	{
		System.out.println("De Spin attractie is goedgekeurd.");
		System.out.println(" ");
	}
	
	public void onderhoudsbeurt()
	{
		System.out.println("Sorry, maar de " + this.getNaam() + " is tijdelijk gesloten voor een onderhoudsbeurt!");
		System.out.print("Fix..Fix..Fix..Fix..Fix..");
		System.out.println("Onderhoudsbeurt is klaar!");
		setDraaiLimiet(5);
	}
	
	public void kansSpelBelastingBetalen() 
	{
		belasting = (getOmzet() / 100) * 30;
	}
}
