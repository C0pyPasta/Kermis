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
	

	public Kassa()
	{		
		
	}
	
	
	public void TotaalOmzetKermis()
	{
		omzetHeleKermis += Botsauto.getOmzet();
		omzetHeleKermis += Spin.getOmzet();
		omzetHeleKermis += Spiegelpaleis.getOmzet();
		omzetHeleKermis += Spookhuis.getOmzet();
		omzetHeleKermis += Hawaii.getOmzet();
		omzetHeleKermis += Ladderklimmen.getOmzet();
		
		System.out.println("De totaal omzet van de hele kermis is: " + omzetHeleKermis);
	}
	
	public void Kaartjes()
	{
		kaartjesBotsauto = Botsauto.getKaartjesVerkocht();
		kaartjesSpin = Spin.getKaartjesVerkocht();
		kaartjesSpiegelpaleis = Spiegelpaleis.getKaartjesVerkocht();
		kaartjesSpookhuis = Spookhuis.getKaartjesVerkocht();
		kaartjesHawaii = Hawaii.getKaartjesVerkocht();
		kaartjesLadderklimmen = Ladderklimmen.getKaartjesVerkocht();
		
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
