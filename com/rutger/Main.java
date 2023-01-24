package kermis.com.rutger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MonteursException {
        new Kermis();
    }
}

class Kermis {
    Kermis() throws MonteursException {
        String keuze;
        int counter = 0;

        BotsAutos botsAutos = new BotsAutos();
        Spin spin = new Spin();
        SpiegelPaleis spiegelhuis = new SpiegelPaleis();
        SpookHuis spookHuis = new SpookHuis();
        Hawaii hawaii = new Hawaii();
        LadderKlimmen ladderKlimmen = new LadderKlimmen();

        Kassa kassaKermis = new Kassa();

        Scanner sc = new Scanner(System.in);

        keuzeMenu();

        do {
            if (counter == 0) {
                System.out.println("Omroeper       : Maak nu uw keuze.");
                System.out.println("Jouw keuze: ");
                counter++;
            } else {
                System.out.println("Omroeper       : Kies nogmaals of ? voor het menu.");
                System.out.println("Jouw keuze: ");
            }

            keuze = sc.next();

            switch (keuze) {
                case "1" -> {
                    kassaKermis.geldInnen(botsAutos.prijsVanDeRit);
                    botsAutos.draaien();
                }
                case "2" -> {
                    kassaKermis.geldInnen(spin.prijsVanDeRit);
                    spin.draaien();
                }
                case "3" -> {
                    kassaKermis.geldInnen(spiegelhuis.prijsVanDeRit);
                    spiegelhuis.draaien();
                }
                case "4" -> {
                    kassaKermis.geldInnen(spookHuis.prijsVanDeRit);
                    spookHuis.draaien();
                }
                case "5" -> {
                    kassaKermis.geldInnen(hawaii.prijsVanDeRit);
                    hawaii.draaien();
                }
                case "6" -> {
                    kassaKermis.geldInnen(ladderKlimmen.prijsVanDeRit);
                    ladderKlimmen.draaien();
                }
                case "o" -> {
                    System.out.println("\n De Kermis: ");
                    System.out.println("-------------------------------\n" +
                            " Totale Omzet:      " + String.format("%6.2f", kassaKermis.overzichtTotaleOmzet()) + " Euro");
                    System.out.println("""

                             De BotsAuto's:     \s
                            -------------------------------""");
                    System.out.println(" Prijs per kaartje: " + String.format("%6.2f", botsAutos.prijsVanDeRit) + " Euro");
                    System.out.println(" Totale Omzet:      " + String.format("%6.2f", botsAutos.kassaAttractie.overzichtTotaleOmzet()) + " Euro");
                    System.out.println(" Totale Winst:      " + String.format("%6.2f", botsAutos.kassaAttractie.overzichtTotaleWinst()) + " Euro" +
                            "\n Tickets verkocht:    " + botsAutos.aantalVerkochteKaartjes() +
                            "\n Belasting:         " + String.format("%6.2f", botsAutos.kassaAttractie.overzichtAfgedragenBelasting()) + " Euro");
                    System.out.println("""

                             De Spin:           \s
                            -------------------------------""");
                    System.out.println(" Prijs per kaartje: " + String.format("%6.2f", spin.prijsVanDeRit) + " Euro");
                    System.out.println(" Totale Omzet:      " + String.format("%6.2f", spin.kassaAttractie.overzichtTotaleOmzet()) + " Euro");
                    System.out.println(" Totale Winst:      " + String.format("%6.2f", spin.kassaAttractie.overzichtTotaleWinst()) + " Euro" +
                            "\n Tickets verkocht:    " + spin.aantalVerkochteKaartjes() +
                            "\n belasting:         " + String.format("%6.2f", spin.kassaAttractie.overzichtAfgedragenBelasting()) + " Euro");
                    System.out.println("""

                             Het SpiegelPaleis: \s
                            -------------------------------""");
                    System.out.println(" Prijs per kaartje: " + String.format("%6.2f", spiegelhuis.prijsVanDeRit) + " Euro");
                    System.out.println(" Totale Omzet:      " + String.format("%6.2f", spiegelhuis.kassaAttractie.overzichtTotaleOmzet()) + " Euro");
                    System.out.println(" Totale Winst:      " + String.format("%6.2f", spiegelhuis.kassaAttractie.overzichtTotaleWinst()) + " Euro" +
                            "\n Tickets verkocht:    " + spiegelhuis.aantalVerkochteKaartjes() +
                            "\n belasting:         " + String.format("%6.2f", spiegelhuis.kassaAttractie.overzichtAfgedragenBelasting()) + " Euro");
                    System.out.println("""

                             Het SpookHuis      \s
                            -------------------------------""");
                    System.out.println(" Prijs per kaartje: " + String.format("%6.2f", spookHuis.prijsVanDeRit) + " Euro");
                    System.out.println(" Totale Omzet:      " + String.format("%6.2f", spookHuis.kassaAttractie.overzichtTotaleOmzet()) + " Euro");
                    System.out.println(" Totale Winst:      " + String.format("%6.2f", spookHuis.kassaAttractie.overzichtTotaleWinst()) + " Euro" +
                            "\n Tickets verkocht:    " + spookHuis.aantalVerkochteKaartjes() +
                            "\n belasting:         " + String.format("%6.2f", spookHuis.kassaAttractie.overzichtAfgedragenBelasting()) + " Euro");
                    System.out.println("""

                             De Hawaii           \s
                            -------------------------------""");
                    System.out.println(" Prijs per kaartje: " + String.format("%6.2f", hawaii.prijsVanDeRit) + " Euro");
                    System.out.println(" Totale Omzet:      " + String.format("%6.2f", hawaii.kassaAttractie.overzichtTotaleOmzet()) + " Euro");
                    System.out.println(" Totale Winst       " + String.format("%6.2f", hawaii.kassaAttractie.overzichtTotaleWinst()) + " Euro" +
                            "\n Tickets verkocht:    " + hawaii.aantalVerkochteKaartjes() +
                            "\n belasting:         " + String.format("%6.2f", hawaii.kassaAttractie.overzichtAfgedragenBelasting()) + " Euro");
                    System.out.println("""

                             Ladder Klimmen      \s
                            -------------------------------""");
                    System.out.println(" Prijs per kaartje: " + String.format("%6.2f", ladderKlimmen.prijsVanDeRit) + " Euro");
                    System.out.println(" Totale Omzet:      " + String.format("%6.2f", ladderKlimmen.kassaAttractie.overzichtTotaleOmzet()) + " Euro");
                    System.out.println(" Totale Winst:      " + String.format("%6.2f", ladderKlimmen.kassaAttractie.overzichtTotaleWinst()) + " Euro" +
                            "\n Tickets verkocht:    " + ladderKlimmen.aantalVerkochteKaartjes() +
                            "\n belasting:         " + String.format("%6.2f", ladderKlimmen.kassaAttractie.overzichtAfgedragenBelasting()) + " Euro" + "\n");
                }
                case "k" -> {
                    System.out.println("\n++++++ Kaartjes ++++++\n");
                    System.out.println("  Totaal verkocht  :" + kassaKermis.totaalAantalVerkochteKaartjes() + "\n");
                    System.out.println("    Per Attractie  ");
                    System.out.println("----------------------");
                    System.out.println("-BotsAutos        : " + botsAutos.kassaAttractie.totaalAantalVerkochteKaartjes());
                    System.out.println("-Spin             : " + spin.kassaAttractie.totaalAantalVerkochteKaartjes());
                    System.out.println("-Spiegel Paleis   : " + spiegelhuis.kassaAttractie.totaalAantalVerkochteKaartjes());
                    System.out.println("-SpookHuis        : " + spookHuis.kassaAttractie.totaalAantalVerkochteKaartjes());
                    System.out.println("-Hawaii           : " + hawaii.kassaAttractie.totaalAantalVerkochteKaartjes());
                    System.out.println("-Ladder Klimmen   : " + ladderKlimmen.kassaAttractie.totaalAantalVerkochteKaartjes());
                    System.out.println("----------------------\n");
                }
                case "m" -> {
                    Monteur storingsMonteur = new Monteur();
                    storingsMonteur.storingsMeldingAfhandelen();
                }
                case "?" -> keuzeMenu();
                case "q" -> System.exit(1);
                default -> System.out.println("Omroeper Kermis: Heb je wel een optie uit het menu gekozen?");
            }
        } while (true);
    }

    public static void keuzeMenu() {
        String buf = """

                *** Hallo en welkom op de Kermis ***
                ++++++++++++++++++++++++++++++++++++
                U mag een keuze maken uit:

                1. De Botsauto's
                2. De Spin
                3. Het Spiegelpaleis
                4. Het Spookhuis
                5. De Hawaii
                6. Ladder Klimmen
                o. De Omzet
                k. Aantal verkochte Kaartjes
                m. De Monteur
                ?. Het KeuzeMenu
                q. Om te Stoppen
                ------------------------------------
                """;
        System.out.println(buf);
    }
}