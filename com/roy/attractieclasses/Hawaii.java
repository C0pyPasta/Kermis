package Kermis.com.roy.attractieclasses;

public class Hawaii extends Attractie
{
	private int draaiLimiet = 10;
		
	public Hawaii(String naam, double prijs, int oppervlakte)
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
			
			System.out.println("Draaien als Hawaii.");
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
		System.out.println("De Hawaii attractie is goedgekeurd.");
		System.out.println(" ");
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
