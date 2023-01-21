package Kermis.com.roy.centraal;

import Kermis.com.roy.attractieclasses.*;

public class Kassa 
{

	Botsauto bots;
	Spin spin;
	Spiegelpaleis spiegel;
	Spookhuis spook;
	Hawaii hawaii;
	Ladderklimmen ladder;

	double omzetHeleKermis;
	int totaalAantalVerkochteKaartjes;
	int kaartjesBotsauto;
	int kaartjesSpin;
	int kaartjesSpiegelpaleis;
	int kaartjesSpookhuis;
	int kaartjesHawaii;
	int kaartjesLadderklimmen;
	public static int aantalKeerDatBelastingInspecteurIsLangsGeweest = 0;
	

	public Kassa(Botsauto bots, Spin spin, Spiegelpaleis spiegel, Spookhuis spook, Hawaii hawaii, Ladderklimmen ladder)
	{
		this.bots = bots;
		this.spin = spin;
		this.spiegel = spiegel;
		this.spook = spook;
		this.hawaii = hawaii;
		this.ladder = ladder;
	}
	
	
	public void TotaalOmzetKermis()
	{
		/* hij pakt steeds de omzet die er al is. plus het zelfde.
		 * dus als ik 5 euro er in heb. en ik vraag 3x achter elkaar om het TotaalOmzet
		 * dan telt hij het bij elkaar op, en dit moet natuurlijk niet.
		 */
		omzetHeleKermis += bots.getOmzet();
		omzetHeleKermis += spin.getOmzet();
		omzetHeleKermis += spiegel.getOmzet();
		omzetHeleKermis += spook.getOmzet();
		omzetHeleKermis += hawaii.getOmzet();
		omzetHeleKermis += ladder.getOmzet();
		
		System.out.println("De totaal omzet van de hele kermis is: " + omzetHeleKermis);
	}
	
	public void Kaartjes()
	{
		kaartjesBotsauto = bots.getKaartjesVerkocht();
		kaartjesSpin = spin.getKaartjesVerkocht();
		kaartjesSpiegelpaleis = spiegel.getKaartjesVerkocht();
		kaartjesSpookhuis = spook.getKaartjesVerkocht();
		kaartjesHawaii = hawaii.getKaartjesVerkocht();
		kaartjesLadderklimmen = ladder.getKaartjesVerkocht();
		
		totaalAantalVerkochteKaartjes = kaartjesBotsauto + kaartjesSpin + kaartjesSpiegelpaleis + kaartjesSpookhuis + kaartjesHawaii + kaartjesLadderklimmen;
		
		System.out.println("Verkochte kaartjes Botsautos: " + kaartjesBotsauto);
		System.out.println("Verkochte kaartjes Spin: " + kaartjesSpin);
		System.out.println("Verkochte kaartjes SpiegelPaleis: " + kaartjesSpiegelpaleis);
		System.out.println("Verkochte kaartjes Spookhuis: " + kaartjesSpookhuis);
		System.out.println("Verkochte kaartjes Hawaii: " + kaartjesHawaii);
		System.out.println("Verkochte kaartjes Ladderklimmen: " + kaartjesLadderklimmen);
		
		System.out.println("Totaal aantal verkochte kaartjes, over alle attracties: " + totaalAantalVerkochteKaartjes);
	}
	
}
