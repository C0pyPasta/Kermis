package Kermis.com.roy.centraal;

import Kermis.com.roy.attractieclasses.*;
import Kermis.com.roy.interfaces.*;

public class BelastingInspecteur 
{
	Botsauto bots;
	Spin spin;
	Spiegelpaleis spiegel;
	Spookhuis spook;
	Hawaii hawaii;
	Ladderklimmen ladder;
	
	double steelBelasting = 0;
	boolean isGokAttractie;
	
	public BelastingInspecteur(Spin spin, Ladderklimmen ladder)
	{
		this.spin = spin;
		this.ladder = ladder;
		
		this.spin.kansSpelBelastingBetalen();
		this.ladder.kansSpelBelastingBetalen();
	}
	
	private void NeemtBelasting()
	{
		steelBelasting = ladder.getBelasting();
		steelBelasting += spin.getBelasting();
		
		System.out.println("Belasting: " + steelBelasting);
		ladder.setBelasting();
		spin.setBelasting();
			
	}
	
	public void CheckGokAttractie()
	{
		if(bots instanceof GokAttractie)
		{
			isGokAttractie = true;
		}
		else
		{
			isGokAttractie = false;
		}
		
		if(spin instanceof GokAttractie)
		{
			isGokAttractie = true;
			NeemtBelasting();
		}
		else
		{
			isGokAttractie = false;
		}
		
		if(spiegel instanceof GokAttractie)
		{
			isGokAttractie = true;
		}
		else
		{
			isGokAttractie = false;
		}
		
		if(spook instanceof GokAttractie)
		{
			isGokAttractie = true;
		}
		else
		{
			isGokAttractie = false;
		}
		
		if(hawaii instanceof GokAttractie)
		{
			isGokAttractie = true;
		}
		else
		{
			isGokAttractie = false;
		}
		
		if(ladder instanceof GokAttractie)
		{
			isGokAttractie = true;
			NeemtBelasting();
		}
		else
		{
			isGokAttractie = false;
		}
	}
}
