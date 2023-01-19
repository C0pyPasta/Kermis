package Kermis.com.roy.attractieclasses;

public class Spin extends Attractie
{
	private String naam;
	private double prijs;
	private int oppervlakte;
	private static double omzet = 0;
	private static int kaartjesVerkocht = 0;
	private int draaiLimiet = 5;
	
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
	}
	
	private void onderhoudsbeurt()
	{
		System.out.println("Sorry, maar de attractie is tijdelijk gesloten!");
		System.out.println("Het is tijd voor een onderhoudsbeurt.");
		System.out.println("Fix..Fix..Fix..Fix..Fix..");
		System.out.println("Onderhoudsbeurt is klaar!");
		draaiLimiet = 5;
	}
}
