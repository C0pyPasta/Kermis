package Kermis.com.roy.attractieclasses;

public class Hawaii extends Attractie
{
	private String naam;
	private double prijs;
	private int oppervlakte;
	private static double omzet = 0;
	private static int kaartjesVerkocht = 0;
	private int draaiLimiet = 10;
	
	public double getOmzet()
	{
		return omzet;
	}
	
	public int getKaartjesVerkocht()
	{
		return kaartjesVerkocht;
	}
	
	public Hawaii()
	{
		naam = "Hawaii";
		prijs = 2.90d;
		oppervlakte = 23;
		opstellingsKeuring();
	}
	
	public void draaien()
	{
		if(draaiLimiet >= 1)
		{
			--draaiLimiet;
			
			System.out.println("Draaien als Hawaii.");
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
		System.out.println("De Hawaii attractie is goedgekeurd.");
	}
	
	private void onderhoudsbeurt()
	{
		System.out.println("Sorry, maar de attractie is tijdelijk gesloten!");
		System.out.println("Het is tijd voor een onderhoudsbeurt.");
		System.out.println("Fix..Fix..Fix..Fix..Fix..");
		System.out.println("Onderhoudsbeurt is klaar!");
		draaiLimiet = 10;
	}
}
