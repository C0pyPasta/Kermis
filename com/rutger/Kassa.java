package kermis.com.rutger;

public class Kassa implements BelastingInspecteur {
    private double omzet;
    private double afgedragenBelasting;
    private int aantalVerkochteKaartjes;

    public void geldInnen(double prijs) {
        this.aantalVerkochteKaartjes++;
        this.omzet += prijs;
    }

    public void belastingAfdragen(double belasting) {
        afgedragenBelasting += belasting;
    }

    public double overzichtTotaleOmzet() {
        return this.omzet;
    }

    public double overzichtTotaleWinst() {
        return (this.omzet - afgedragenBelasting);
    }

    public int totaalAantalVerkochteKaartjes() {
        return aantalVerkochteKaartjes;
    }

    public double overzichtAfgedragenBelasting() {
        return afgedragenBelasting;
    }

    @Override
    public double checkAdministratie(int verkochteKaartjes, double omzet, boolean risicoAttractie) {
        if (risicoAttractie) {

            double afTeDragenBelasting;
            afTeDragenBelasting = Math.round(omzet / 100 * risicoAttractieBelasting);

            //("%6.2f", spin.prijsVanDeRit)

            System.out.println("inspecteur Bel.: Aha een risico attractie!");
            System.out.println("Inspecteur Bel.: Wat was uw omzet?" + String.format("%6.2f", this.omzet) + " Euro? Aha juist ja.");
            System.out.println("Inspecteur Bel.: En hoeveel kaartjes zijn er verkocht? " + verkochteKaartjes + "? Aha ok..");
            System.out.println("Inspecteur Bel.: Dat is dan " + afTeDragenBelasting + " Euro");
            System.out.println("Inspecteur Bel.: Dank u wel, carry on...");

            return afTeDragenBelasting;
        }
        System.out.println("Inspecteur Bel.: U bent geen Attractie uit de risico catagorie");
        System.out.println("Inspecteur Bel.: Daarbij bent u ontheven van risico belasting");
        System.out.println("Inspecteur Bel.: Gaat u verder...");

        return 0.00;
    }
}