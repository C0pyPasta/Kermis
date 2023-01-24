package kermis.com.rutger;

abstract class Attractie {
    private int aantalVerkochteKaartjes;
    private boolean isAttractieNetNeergezet = true;
    private boolean isRisicoAttractie = true;
    private boolean isDefect = false;

    static final String gaveRit = "Omroeper       : Wow dat was een gave rit of niet!";
    static final String snelleRit = "Omroeper       : Kan ie nog sneller!!! ";
    static final String mooieRit = "Omroeper       : Jeetje mieneetje wat een mooie Rit was dat!";
    static final String opvallendeRit = "Omroeper       : Wat was DAT!!!! Hebben jullie dat ook gezien?";
    static final String geweldigeRit = "Omroeper       : Een geweldige rit weer, ohyeah...";

    protected Monteur monteur = new Monteur();
    Kassa kassaAttractie = new Kassa();

    abstract void draaien() throws MonteursException;

    public boolean isAttractieNetOpgesteld() {
        if(isAttractieNetNeergezet) {
            isAttractieNetNeergezet = false;
            return true;
        }
        return false;
    }

    public void registreerAlsRisicoAttractie() {
        this.isRisicoAttractie = true;
    }

    public boolean isRisicoAttractie() {
        return isRisicoAttractie;
    }

    public void neemTicketAan() {
        aantalVerkochteKaartjes++;
    }

    public int aantalVerkochteKaartjes() {
        return aantalVerkochteKaartjes;
    }

    public void administratieBijwerken(double price) {
        this.neemTicketAan();
        kassaAttractie.geldInnen(price);
        if(this.aantalVerkochteKaartjes() % 15 == 0) {
            double belastingSchuld = kassaAttractie.checkAdministratie(this.aantalVerkochteKaartjes(), kassaAttractie.overzichtTotaleWinst(), this.isRisicoAttractie());
            kassaAttractie.belastingAfdragen(belastingSchuld);
        }
    }

    public String omroeperStatement() {
        int gekozenStatement = (int) (Math.random() * 10) / 2;
        if(gekozenStatement == 1) {
            return gaveRit;
        } else if (gekozenStatement == 2) {
            return snelleRit;
        } else if (gekozenStatement == 3) {
            return mooieRit;
        } else if (gekozenStatement == 4) {
            return opvallendeRit;
        } else {
            return geweldigeRit;
        }
    }
}

abstract class RisicoRijkeAttractie extends Attractie {

    abstract void aanmeldenAlsRisicoAttractie();

}

interface GokAttractie {
    public final int kansSpelBelasting = 30;

    abstract void kansSpelBelastingBetalen();

}

class BotsAutos extends Attractie {
   final double prijsVanDeRit = 2.50;

    @Override
    void draaien() {
        System.out.println("Omroeper       : Welkom bij De Botsauto's! \nOmroeper       : Maak je klaar voor de rit!!");
        administratieBijwerken(prijsVanDeRit);
        System.out.println("Omroeper       : \"All right, vasten your seatbelts\", daar gaan we!");
        System.out.println(omroeperStatement());
    }
}

class Spin extends RisicoRijkeAttractie implements GokAttractie {
    final double prijsVanDeRit = 2.25;

    @Override
    void aanmeldenAlsRisicoAttractie() {
        this.registreerAlsRisicoAttractie();
    }

    @Override
    void draaien() throws MonteursException {
        System.out.println("Omroeper       : Welkom bij De Spin! \nOmroeper       : Maak je klaar voor de rit!!");

        if(!Monteur.isDefect) {
            administratieBijwerken(prijsVanDeRit);

            if(this.isAttractieNetOpgesteld()) {
                monteur.voerOpstellingsKeuringUit();
            }

            if(this.aantalVerkochteKaartjes() % 5 == 0) {
                monteur.voerPeriodiekeKeuringUit();
            }

            if(this.aantalVerkochteKaartjes() != 1 && this.aantalVerkochteKaartjes() % 5 == 1) {
                monteur.storing();
                return;
            }
        } else {
            System.out.println("Omroeper       : Sorry, deze Attractie is defect.");
            System.out.println("Omroeper       : Om hem te repareren moet je eerst de monteur");
            System.out.println("Omroeper       : vragen of hij er even naar wil kijken (keuze m)");
            Kermis.keuzeMenu();
            return;
        }
        System.out.println("Omroeper       : \"All right, vasten your seatbelts\", daar gaan we!");
        System.out.println(omroeperStatement());
    }

    @Override
    public void kansSpelBelastingBetalen() {
        double kansSpelBelasting = ((this.kassaAttractie.overzichtTotaleOmzet() + 2.25) / 100) * this.kansSpelBelasting;
        this.kassaAttractie.belastingAfdragen(kansSpelBelasting);
        System.out.println("inspecteur Bel.: U betaalt " + kansSpelBelasting + " Euro aan Kans Spel belasting");
        System.out.println("inspecteur Bel.: Dank u voor uw medewerking, gaat u verder");
    }
}

class SpiegelPaleis extends Attractie {
    final double prijsVanDeRit = 2.75;

    @Override
    void draaien() {
        System.out.println("Omroeper       : Welkom bij Het Spiegelpaleis! \nOmroeper       : Maak je klaar voor de rit!!");
        administratieBijwerken(prijsVanDeRit);
        System.out.println("Omroeper       : \"All right, vasten your seatbelts\", daar gaan we!");
        System.out.println(omroeperStatement());
    }
}

class SpookHuis extends Attractie {
   final  double prijsVanDeRit = 3.20;

    @Override
    void draaien() {
        System.out.println("Omroeper       : Welkom bij Het Spookhuis! \nOmroeper       : Maak je klaar voor de rit!!");
        administratieBijwerken(prijsVanDeRit);
        System.out.println("Omroeper       : \"All right, vasten your seatbelts\", daar gaan we!");
        System.out.println(omroeperStatement());
    }
}

class Hawaii extends RisicoRijkeAttractie {
    final double prijsVanDeRit = 2.90;

    @Override
    void aanmeldenAlsRisicoAttractie() {
        this.registreerAlsRisicoAttractie();
    }

    @Override
    void draaien() throws MonteursException {
        System.out.println("Omroeper       : Welkom bij De Hawaii! \nOmroeper       : Maak je klaar voor de rit!!");

        if(!Monteur.isDefect) {
            administratieBijwerken(prijsVanDeRit);
            if (this.isAttractieNetOpgesteld()) {
                monteur.voerOpstellingsKeuringUit();
            }

            if (this.aantalVerkochteKaartjes() % 10 == 0) {
                monteur.voerPeriodiekeKeuringUit();
            }

            if (this.aantalVerkochteKaartjes() != 1 && this.aantalVerkochteKaartjes() % 10 == 1) {
                monteur.storing();
                return;
            }
        } else {
            System.out.println("Omroeper       : Sorry, deze Attractie is defect.");
            System.out.println("Omroeper       : Om hem te repareren moet je eerst de monteur");
            System.out.println("Omroeper       : vragen of hij er even naar wil kijken (keuze m)");
            Kermis.keuzeMenu();
            return;
        }
        System.out.println("Omroeper       : \"All right, vasten your seatbelts\", daar gaan we!");
        System.out.println(omroeperStatement());
    }
}

class LadderKlimmen extends Attractie implements GokAttractie {
    final double prijsVanDeRit = 5.00;

    @Override
    void draaien() {
        System.out.println("Omroeper       : Welkom bij het Ladderklimmen! \nOmroeper       : Maak je klaar voor de rit!!");
        kansSpelBelastingBetalen();
        administratieBijwerken(prijsVanDeRit);
        System.out.println("Omroeper       : \"All right, vasten your seatbelts\", daar gaan we!");
        System.out.println(omroeperStatement());
    }

    @Override
    public void kansSpelBelastingBetalen() {
        double kansSpelBelasting = ((this.kassaAttractie.overzichtTotaleOmzet() + 5) / 100) * this.kansSpelBelasting;
        this.kassaAttractie.belastingAfdragen(kansSpelBelasting);
        System.out.println("inspecteur Bel.: U betaalt " + kansSpelBelasting + " Euro aan Kans Spel belasting");
        System.out.println("inspecteur Bel.: Dank u voor uw medewerking, gaat u verder");
    }
}