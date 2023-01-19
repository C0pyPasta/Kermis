package Kermis.centraal;

import Kermis.com.roy.attractieclasses.*;

public class Kassa 
{
	
	Botsauto bots = new Botsauto();
	Spin spin = new Spin();
	Spiegelpaleis spiegel = new Spiegelpaleis();
	Spookhuis spook = new Spookhuis();
	Hawaii hawaii = new Hawaii();
	Ladderklimmen ladder = new Ladderklimmen();
	
	
	double omzetHeleKermis;
	int totaalAantalVerkochteKaartjes;
	int kaartjesBotsauto;
	int kaartjesSpin;
	int kaartjesSpiegelpaleis;
	int kaartjesSpookhuis;
	int kaartjesHawaii;
	int kaartjesLadderklimmen;

	public Kassa()
	{		
		
	}
	
	
	public void TotaalOmzetKermis()
	{
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
		kaartjesBotsauto += bots.getKaartjesVerkocht();
		kaartjesSpin += spin.getKaartjesVerkocht();
		kaartjesSpiegelpaleis += spiegel.getKaartjesVerkocht();
		kaartjesSpookhuis += spook.getKaartjesVerkocht();
		kaartjesHawaii += hawaii.getKaartjesVerkocht();
		kaartjesLadderklimmen += ladder.getKaartjesVerkocht();
		
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
