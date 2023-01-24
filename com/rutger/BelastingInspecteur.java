package kermis.com.rutger;

interface BelastingInspecteur {
    static final double risicoAttractieBelasting = 8;

    abstract double checkAdministratie(int verkochteKaartjes, double omzet, boolean risicoAttractie);
}