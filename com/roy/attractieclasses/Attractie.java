package Kermis.com.roy.attractieclasses;

public abstract class Attractie
{
	private String naam;
	private double prijs;
	private int oppervlakte;
	private double omzet;
	private int kaartjesVerkocht;
	
	
	public String getNaam() 
	{
		return naam;
	}

	public void setNaam(String naam) 
	{
		this.naam = naam;
	}

	public double getPrijs() 
	{
		return prijs;
	}

	public void setPrijs(double prijs) 
	{
		this.prijs = prijs;
	}

	public int getOppervlakte() 
	{
		return oppervlakte;
	}

	public void setOppervlakte(int oppervlakte) 
	{
		this.oppervlakte = oppervlakte;
	}

	public double getOmzet() 
	{
		return omzet;
	}

	public void setOmzet(double omzet)
	{
		this.omzet = omzet;
	}

	public int getKaartjesVerkocht() 
	{
		return kaartjesVerkocht;
	}

	public void setKaartjesVerkocht(int kaartjesVerkocht)
	{
		this.kaartjesVerkocht = kaartjesVerkocht;
	}

	abstract void draaien();
	
	public void opstellingsKeuring()
	{
		
	}
}
